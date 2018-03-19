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

CHARTEST:
  '\''('c')'\'';

ID  :
  ('a'..'z' | 'A'..'Z')+;



CHARLIT:
  '\''('0'..'z')'\'';





WS_ : (' ' | '\n' ) -> skip;

SL_COMMENT : '//' (~'\n')* '\n' -> skip;


STRING : '"' (ESC|~'"')* '"';

fragment
ESC :  '\\' ('n'|'"');
