grammar slf;

options
{
	tokenVocab = slfLexer;
}

program:				command*;

command:				expression SEMICOLON												#expressionCommand
						| while_statement SEMICOLON											#whileStatementCommand
						| declaration SEMICOLON												#declarationCommand
						;

return_expression:		RETURN expression SEMICOLON;

expression:				OPAREN expression CPAREN											#closedExpression
						| MINUS expression													#negativeExpression
						| NOT expression													#negateExpression

						| expression (MODULO | TIMES | DIVIDE) expression					#multiplyExpression
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

while_statement:		WHILE OPAREN expression CPAREN OCURLY command* CCURLY;

declaration:			type IDENTIFIER (COMMA IDENTIFIER)*
						| CONSTANT? type IDENTIFIER (COMMA IDENTIFIER)* BECOMES expression;

read_expression:		READ OPAREN IDENTIFIER (COMMA IDENTIFIER)* CPAREN;

print_expression:		PRINT OPAREN expression (COMMA expression)* CPAREN;

if_expression:			IF OPAREN expression CPAREN THEN compound_expression (ELSE compound_expression)?;

compound_expression:	OCURLY command* return_expression CCURLY;

assignment_expression:	IDENTIFIER BECOMES expression;

literal:				LITERALBOOLEAN														#literal_boolean
						| LITERALSTRING														#literal_string
						| LITERALCHARACTER													#literal_character
						| LITERALNUMBER														#literal_number
						;

type:					BOOLEAN																#boolean
						| STRING															#string
						| CHAR																#char
						| INT																#int
						;
