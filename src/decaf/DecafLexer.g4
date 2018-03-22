lexer grammar DecafLexer;

@header {
package decaf;
}

options
{
  language=Java;
}


LCURLY : '{';
RCURLY : '}';


ID  :
  ('_'|LETTER)(LETTER|DIGIT|'_')*;
 
CHARLIT:
 '\''(' '..'!' | '#'..'&' | '('..'[' | ']'..'~' |ESCZ )'\''  ;

STRINGLIT:
'"' (CHARLIT*) '"';
 


SL_COMMENT : '//' (~'\n')* '\n' -> skip;


STRING : '"' (ESC|~'"')* '"';

fragment
DIGIT  : ('0'..'9');

fragment
LETTER  : ('a'..'z' | 'A'..'Z');

fragment
ESC :  '\\' ('n'|'"' );

fragment
ESCZ : '\\'( 'n' | 't' |'\\'|'\"' | '\'' );

WS_ : (' ' | '\n' ) -> skip;
