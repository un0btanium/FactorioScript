package entities.compiler;

import java.util.ArrayList;


public class StatementList implements CompilerEntity {

	
	private ArrayList<Statement> statements;

	
	public StatementList () {
		statements = new ArrayList<>();
	}

	public void addStatement(int i, Statement statement) {
		statements.add(i, statement);
	}
	
	public void getEntities(EntityGatherer entityGatherer) {
		for (Statement statement : statements) {
			if (statement.getClass() != StatementNone.class) {
				entityGatherer.checkForPowerPole();
				statement.getEntities(entityGatherer);
				entityGatherer.offsetY += 2;
			}
		}
		
		
	}

}
