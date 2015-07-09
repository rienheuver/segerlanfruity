lexer grammar slfLexer;

// operators
BECOMES:		'=';
PLUS:			'+';
MINUS:			'-';
TIMES:			'*';
DIVIDE:			'/';
MODULO:			'%';

EQUALS:			'==';
LT:				'<';
LTE:			'<=';
GT:				'>';
GTE:			'>=';
UNEQUALS:		'!=';
AND:			'&&';
OR:				'||';
NOT:			'!';

//keywords
CONSTANT:		'constant';
PRINT:			'print';
READ:			'read';
IF:				'if';
ELSE:			'else';
WHILE:			'while';
INT:			'int';
CHAR:			'char';
BOOLEAN:		'boolean';
STRING:			'string';
RETURN:			'return';

//interpunction
COLON:			':';
SEMICOLON:		';';
OPAREN:			'(';
CPAREN:			')';
OCURLY:			'{';
CCURLY:			'}';
COMMA:			',';

// values
LITERALBOOLEAN:		'true' | 'false';
LITERALSTRING:			'"' ('\\"' | '\\\\' | ~('\n'|'\r') )*? '"'; // escapes \\ and \"
LITERALCHARACTER:		'\'' ( '\\\'' | ~('\n'|'\r') )*? '\''; // escapes ' and \'
LITERALNUMBER:			DIGIT+;

IDENTIFIER:				LETTER (LETTER | DIGIT)*;

COMMENT:		'//' ~[\r\n]* -> skip;

WS:				[ \t\r\n]+ -> skip;

fragment DIGIT:	('0'..'9');
fragment LETTER:('a'..'z' | 'A'..'Z');