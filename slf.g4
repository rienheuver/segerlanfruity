grammar slf;

options
{
	tokenVocab = slfLexer;
}

program:				command*;

command:				expression SEMICOLON
						| while_statement SEMICOLON
						| declaration SEMICOLON;

expression:				OPAREN expression CPAREN
						| (MINUS | NOT) expression
						| expression (MODULO | TIMES | DIVIDE) expression
						| expression (PLUS | MINUS) expression
						| expression (LT | LTE | GT | GTE | EQUALS | UNEQUALS) expression
						| expression AND expression
						| expression OR expression
						| read_expression
						| print_expression
						| if_expression
						| compound_expression
						| assignment_expression
						| literal
						| IDENTIFIER;

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