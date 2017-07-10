package factorioscript;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Base64;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import antlr.FactorioScriptLexer;
import antlr.FactorioScriptParser;
import entities.blueprint.Blueprint;
import entities.blueprint.BlueprintRoot;
import entities.blueprint.Entity;
import entities.blueprint.Icon;
import entities.blueprint.Signal;
import entities.compiler.CompilerEntity;
import entities.compiler.EntityGatherer;
import entities.compiler.StatementList;

public class App {

	public static void main(String[] args) {

		System.out.println();
		System.out.println("\tFactorioScript v0.1.1");
		System.out.println("\tby unobtanium");
		System.out.println();
		// READ CODE IN FROM FILE
		System.out.println("\tReading input file: " + args[0]);
		String code = "";
		try {
			byte[] encoded = Files.readAllBytes(Paths.get(args[0]));
			code = new String(encoded, "UTF-8");
		} catch (IOException e) {
			System.err.println("ERROR! While reading file.");
			e.printStackTrace();
			return;
		}

		if (code.equals("")) {
			System.out.println("\tNo code available!");
			return;
		}

		// SEND CODE TO ANTLR LEXER AND PARSER
		System.out.println("\tDoing magic!");
		CharStream charStream = null;
		charStream = new ANTLRInputStream(code);
		FactorioScriptLexer lexer = new FactorioScriptLexer(charStream);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		FactorioScriptParser parser = new FactorioScriptParser(tokens);

		// SEND PARSETREE TO VISITOR
		System.out.println("\tMore magic!");
		CompilerVisitor compilerVisitor = new CompilerVisitor();
		CompilerEntity compilerEntity = compilerVisitor.visit(parser.statementList());

		// EXTRACT BLUEPRINT ENTITIES FROM COMPILER ENTITIES
		System.out.println("\tAlmost done!");
		StatementList statementList = (StatementList) compilerEntity;
		EntityGatherer entityGatherer = new EntityGatherer();
		statementList.getEntities(entityGatherer);

		// PUT ENTITIES IN BLUEPRINT
		System.out.println("\tCreating blueprint string!");
		Blueprint blueprint = new Blueprint();
		Entity[] entities = new Entity[entityGatherer.entities.size()];
		blueprint.entities = entityGatherer.entities.toArray(entities);
		blueprint.item = "blueprint";
		blueprint.label = "FactoryScript by unobtanium";
		blueprint.icons = new Icon[] { new Icon(1, new Signal("arithmetic-combinator")) };
		BlueprintRoot blueprintRoot = new BlueprintRoot();
		blueprintRoot.blueprint = blueprint;

		// CREATE BLUEPRINT STRING
		String blueprintString = "0" + encode(compress(getStringFromBlueprintRoot(blueprintRoot)));
		System.out.println();
		System.out.println(blueprintString);
		System.out.println();

		// GENERATE OUTPUT FILE
		File file = new File(args[0]);
		String path = file.getPath();
		String directory = path.substring(0, path.lastIndexOf(System.getProperty("file.separator")));
		directory += System.getProperty("file.separator") + "blueprint.txt";
		System.out.println("\tExporting blueprint string into: " + directory);
		try (
			Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(directory), "utf-8"))) {
			writer.write(blueprintString);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println();
		System.out.println("\tFinished!");
		System.out.println();
		System.out.println();

		//
		// byte[] blueprintDecoded = decode(blueprintString);
		//
		// String blueprintDecompressed = decompress(blueprintDecoded);
		//
		// System.out.println(prettify(blueprintDecompressed));
		//
		//
		//
		// BlueprintRoot blueprintRoot =
		// getBlueprintRootFromString(blueprintDecompressed);
		//
		// System.out.println(getStringFromBlueprintRoot(blueprintRoot));
		//
		// System.out.println(encode(compress(blueprintDecompressed)));
		//

	}

	public static String prettify(String str) {
		ObjectMapper mapper = new ObjectMapper();
		Object json = null;
		try {
			json = mapper.readValue(str, Object.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String indented = null;
		try {
			indented = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(json);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return indented;
	}

	public static BlueprintRoot getBlueprintRootFromString(String str) {
		ObjectMapper mapper = new ObjectMapper();
		BlueprintRoot blueprintRoot = null;
		try {
			blueprintRoot = mapper.readValue(str, BlueprintRoot.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return blueprintRoot;
	}

	public static String getStringFromBlueprintRoot(BlueprintRoot blueprintRoot) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		String jsonInString = null;
		try {
			jsonInString = mapper.writeValueAsString(blueprintRoot);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonInString;
	}

	public static byte[] decode(String str) {
		byte[] decoded = null;
		try {
			decoded = Base64.getDecoder().decode(str.substring(1, str.length()).getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		return decoded;
	}

	public static String encode(byte[] bytes) {
		String encoded = null;
		encoded = Base64.getEncoder().encodeToString(bytes);
		return encoded;
	}

	public static String decompress(byte[] bytes) {
		InputStream in = new InflaterInputStream(new ByteArrayInputStream(bytes));
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			byte[] buffer = new byte[8192];
			int len;
			while ((len = in.read(buffer)) > 0)
				baos.write(buffer, 0, len);
			return new String(baos.toByteArray(), "UTF-8");
		} catch (IOException e) {
			throw new AssertionError(e);
		}
	}

	public static byte[] compress(String text) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			OutputStream out = new DeflaterOutputStream(baos);
			out.write(text.getBytes("UTF-8"));
			out.close();
		} catch (IOException e) {
			throw new AssertionError(e);
		}
		return baos.toByteArray();
	}

}
