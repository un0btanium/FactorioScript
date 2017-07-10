grammar FactorioScript;

statementList		: s=statement sl=statementList																#multipleStatementList
					| s=statement																				#singleStatementList
					;

statement			: statementCompiler
					| statementAssign
					| statementIf
					;

statementCompiler	: COMPILERSIGN STANDARD ALIASASSIGN varLeft=VAR varRight=VAR								#CompilerStandard
					| COMPILERSIGN ALIAS varOld=VAR ALIASASSIGN varAlias=VAR									#CompilerAlias
					;

statementAssign		: var=VAR ASSIGN expr=expression  															#overwriteStatementAssign
					| var=VAR PLUS ASSIGN expr=expression														#addStatementAssign
					| var=VAR MINUS ASSIGN expr=expression														#subStatementAssign
					;

statementIf			: IF BRACKET_OPEN condition BRACKET_CLOSE BRACE_OPEN statementList BRACE_CLOSE ELSEIF BRACKET_OPEN condition BRACKET_CLOSE BRACE_OPEN statementList BRACE_CLOSE ELSE BRACKET_OPEN condition BRACKET_CLOSE BRACE_OPEN statementList BRACE_CLOSE #ifElseIfElseStatement
					| IF BRACKET_OPEN condition BRACKET_CLOSE BRACE_OPEN statementList BRACE_CLOSE ELSE BRACKET_OPEN condition BRACKET_CLOSE BRACE_OPEN statementList BRACE_CLOSE #ifElseStatement
					| IF BRACKET_OPEN condition BRACKET_CLOSE BRACE_OPEN statementList BRACE_CLOSE #ifStatement
					;
					
expression			: BRACKET_OPEN expr=expression BRACKET_CLOSE												#priorityExp
					| left=expression operand=(ASTERISK|SLASH|MODULO) right=expression							#mulDivModExp
					| left=expression operand=(PLUS|MINUS) right=expression										#addSubExp
					| left=expression operand=(BIT_LEFT|BIT_RIGHT|BIT_AND|BIT_OR|BIT_XOR) right=expression		#bitExp
					| <assoc=right> left=expression POWER right=expression										#powExp
					| variable=VAR																				#varExp
					| number=NUMBER																				#numExp
					;

condition			: expression  (EQUAL|NOTEQUAL|GREATER|LOWER|GREATEREQUAL|LOWEREQUAL) expression;

COMPILERSIGN		: '#' ;
STANDARD			: ('standard'|'STANDARD') ;
ALIAS				: ('alias'|'ALIAS') ;
ALIASASSIGN			: '=>' ;

IF					: ('if'|'IF') ;
ELSEIF				: ('elseif'|'ELSEIF') ;
ELSE				: ('else'|'ELSE') ;
BRACKET_OPEN		: '(' ;
BRACKET_CLOSE		: ')' ;
BRACE_OPEN			: '{' ;
BRACE_CLOSE			: '}' ;

ASTERISK            : '*' ;
SLASH               : '/' ;
MODULO				: '%' ;
PLUS                : '+' ;
MINUS               : '-' ;
BIT_LEFT			: '<<' ;
BIT_RIGHT			: '>>' ;
BIT_AND				: 'AND' ;
BIT_OR				: 'OR' ;
BIT_XOR				: 'XOR' ;
POWER				: '^' ;



EQUAL				: '==' ;
NOTEQUAL			: '!=' ;
GREATER				: '>' ;
LOWER				: '<' ;
GREATEREQUAL		: '>=' ;
LOWEREQUAL			: '<=' ;

ASSIGN				: '=' ;

NUMBER				: [0-9]+ ;

VAR					: [a-z][a-zA-Z0-9\-]* ;

WS					: [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
