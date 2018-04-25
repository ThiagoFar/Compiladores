lexer grammar DecafLexer;

@header {
package decaf;
}

options
{
  language=Java;
}

tokens
{
  TK_class
}

PROGRAM: 'Program';
LCURLY : '{';
RCURLY : '}';
LBRACKET: '[';
RBRACKET: ']';
LPARENTHESIS: '(';
RPARENTHESIS: ')';
COMMA: ',';
SEMICOLON: ';';

IF:'if';
BOOLEAN : 'boolean';
BOOLEANLITERAL: ('true'|'false');
BREAK: 'break';
CALLOUT: 'callout';
CLASS: 'class';
CONTINUE: 'continue';
ELSE: 'else';
FOR: 'for';
INT: 'int';
RETURN: 'return';
VOID: 'void';



 
ID :('a'..'z' | 'A'..'Z'|'_')('a'..'z' | 'A'..'Z'|'_'|'0'..'9')*;
CHARLIT : '\'' (ESC|'a'..'z'|'A'..'Z'|'0'..'9'|~'\''|'\\t'|'\\\\') '\''; 
STRINGLIT : '"' (ESC|ID|OP_ARIT|' '|','|'.'|';'|':'|'?'|'!'|'\\'|',' ~('"')|INTLIT)* '"';
INTLIT: ('0'..'9')+;


HEXDEX:'0x' ('0'..'9'|'a'..'f'|'A'..'F')+;
 

MINUS:'-';

SL_COMMENT : '//' (~'\n')* '\n' -> skip;



OP_ATRIB: '=';

OP_ATR_DECR: '-=' ;

OP_ATR_INCR: '+=' ;

OP_ARIT: ('+'|'*'|'/'|'%');

OP_REL : ('>'|'<'|'>='|'<=');

OP_EQ : ('=='|'!=') ;

OP_COND: ('&&'|'||');

EXCLAMATION: '!';



fragment
LETTER  : ('a'..'z' | 'A'..'Z');

fragment
ESC :  '\\' ('n'|'"' );

fragment
ESCZ : '\\'( 'n' | 't' |'\\'|'\"' | '\'' );

WS_ : (' ' | '\n' |'\t' ) -> skip;
