grammar slf;

options
{
	tokenVocab = slfLexer;
}

program:				command*;

command:				expression SEMICOLON
						| while_statement SEMICOLON
						| declaration SEMICOLON;

expression:				OPAREN expression CPAREN											#closedExpression
						| (MINUS | NOT) expression											#unaryExpression

						| expression (MODULO | TIMES | DIVIDE) expression					#multiExpression
						| expression (PLUS | MINUS) expression								#additionExpression

						| expression (LT | LTE | GT | GTE | EQUALS | UNEQUALS) expression	#compareExpression

						| expression AND expression											#andExpression
						| expression OR expression											#orExpression

						| read_expression													#readExpression
						| print_expression													#printExpression
						| if_expression														#ifExpression
						| compound_expression												#compoundExpression
						| assignment_expression												#assignmentExpression
						| literal															#literalExpression
						| IDENTIFIER														#IDENTIFIERExpression
						;

while_statement:		WHILE OPAREN expression CPAREN OCURLY command+ CCURLY;

declaration:			TYPE IDENTIFIER (COMMA IDENTIFIER)*
						| CONSTANT? TYPE IDENTIFIER (COMMA IDENTIFIER)* BECOMES expression;

read_expression:		READ OPAREN IDENTIFIER (COMMA IDENTIFIER)* CPAREN;

print_expression:		PRINT OPAREN expression (COMMA expression)* CPAREN;

if_expression:			IF OPAREN expression CPAREN THEN OCURLY command+ CCURLY (ELSE OCURLY command+ CCURLY)?;

compound_expression:	OCURLY (command* expression)? CCURLY;

assignment_expression:	IDENTIFIER BECOMES expression;

literal:				BOOLEAN
						| STRING
						| CHARACTER
						| NUMBER;