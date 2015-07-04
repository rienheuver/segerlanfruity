grammar slf;

options
{
	tokenVocab = slfLexer;
}

program:				command*;

command:				expression SEMICOLON												#expressionCommand
						| if_statement SEMICOLON											#ifStatementCommand
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

// if_statements do not return a value, since they are standalone
if_statement:			IF OPAREN expression CPAREN OCURLY program CCURLY (ELSE OCURLY program CCURLY)?;

while_statement:		WHILE OPAREN expression CPAREN OCURLY program CCURLY;

declaration:			type IDENTIFIER (COMMA IDENTIFIER)*
						| CONSTANT? type IDENTIFIER (COMMA IDENTIFIER)* BECOMES expression;

read_expression:		READ OPAREN IDENTIFIER (COMMA IDENTIFIER)* CPAREN;

print_expression:		PRINT OPAREN expression (COMMA expression)* CPAREN;

// if_expressions do return a value, since they can be used as an expression
if_expression:			IF OPAREN expression CPAREN compound_expression (ELSE compound_expression)?;

compound_expression:	OCURLY program return_expression CCURLY;

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
