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
THEN:			'then';
ELSE:			'else';
WHILE:			'while';
TYPE:			'int' | 'char' | 'boolean' | 'string';

//interpunction
COLON:			':';
SEMICOLON:		';';
OPAREN:			'(';
CPAREN:			')';
OCURLY:			'{';
CCURLY:			'}';
COMMA:			',';

// values
BOOLEAN:		'true' | 'false';
STRING:			'"' ('\\"' | '\\\\' | ~('\n'|'\r') )*? '"'; // "string" escapes \" and \\
CHARACTER:		'\'' ( '\\\'' | ~('\n'|'\r') )*? '\''; // 'c' escapes '\''
IDENTIFIER:		LETTER (LETTER | DIGIT)*;
NUMBER:			DIGIT+;

COMMENT:		'//' ~[\r\n]* -> skip;

WS:				[ \t\r\n]+ -> skip;

fragment DIGIT:	('0'..'9');
fragment LETTER:('a'..'z' | 'A'..'Z');