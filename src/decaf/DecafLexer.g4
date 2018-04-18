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


LCURLY : '{';
RCURLY : '}';
LBRACKET: '[';
RBRACKET: ']';
LPARENTHESIS: '(';
RPARENTHESIS: ')';

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


ID  :
  ('_'|LETTER)(LETTER|DIGIT|'_')*;
 
CHARLIT: '\''(' '..'!' | '#'..'&' | '('..'[' | ']'..'~' |ESCZ )'\''  ;

STRINGLIT : '"' (ESCZ|ESC|ID|OP_ATM|' '|','|'.'|';'|':'|'?'|'!'|'\\'|',' ~('"')|DIGIT)* '"';

HEXDEX:'0x' ('0'..'9'|'a'..'f'|'A'..'F')+;
 
OP_ATM: ('+'|'*'|'/'|'%');

MINUS:'-';

OP_COND: ('>'|'<'|'>='|'<='|'=='|'!='|'&&'|'||');

SL_COMMENT : '//' (~'\n')* '\n' -> skip;

INTLITERAL: (DIGIT)+ (~('a'..'z')) ;



fragment
DIGIT  : ('0'..'9');

fragment
LETTER  : ('a'..'z' | 'A'..'Z');

fragment
ESC :  '\\' ('n'|'"' );

fragment
ESCZ : '\\'( 'n' | 't' |'\\'|'\"' | '\'' );

WS_ : (' ' | '\n' |'\t' ) -> skip;
