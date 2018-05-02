parser grammar DecafParser;

@header {
package decaf;
}

options
{
  language=Java;
  tokenVocab=DecafLexer;
}



program: CLASS PROGRAM LCURLY field_decl* method_decl*   RCURLY EOF; 

field_decl:               type ID (COMMA type ID)* SEMICOLON
			| type ID LBRACKET int_literal RBRACKET (COMMA type ID LBRACKET int_literal RBRACKET)* SEMICOLON ;

method_decl: ( type | VOID ) ID LPARENTHESIS ( type ID (COMMA type ID)* )* RPARENTHESIS block ;

block: LCURLY var_decl* statement* RCURLY;

var_decl: type ID (COMMA (type ID | ID))* SEMICOLON;

type: INT 
    | BOOLEAN;

int_literal: decimal_literal 
           | hex_literal;

decimal_literal: INTLIT;

hex_literal: HEXDEX;

statement:                location assign_op expr SEMICOLON
			| method_call SEMICOLON
			| IF LPARENTHESIS expr RPARENTHESIS block (ELSE block)*
			| FOR ID OP_ATRIB expr COMMA expr block
			| RETURN expr* SEMICOLON
			| BREAK SEMICOLON
			| CONTINUE SEMICOLON
			| block ;
			
assign_op: OP_ATRIB  
         | OP_ATR_INCR 
         | OP_ATR_DECR;
			
method_call:              method_name LPARENTHESIS (expr (COMMA expr)*)* RPARENTHESIS
		        | CALLOUT LPARENTHESIS string_literal (COMMA callout_arg)* RPARENTHESIS ;

method_name : ID;

location:      ID 
             | ID LBRACKET expr RBRACKET ;

expr:             location
		| method_call
		| literal
		| expr bin_op expr
		| MINUS expr
		| EXCLAMATION expr
		| LPARENTHESIS expr RPARENTHESIS;

callout_arg     : expr 
                | string_literal ;

bin_op          : arith_op 
                | rel_op 
                | eq_op 
                | cond_op ;

arith_op        : OP_ARIT 
                | MINUS ;

rel_op : OP_REL ;

eq_op : OP_EQ ;

cond_op : OP_COND ;

literal : int_literal 
        | char_literal 
        | bool_literal ;

bool_literal : BOOLEANLITERAL;

char_literal : CHARLIT ;

string_literal : STRINGLIT ;





















			
			




















			
			

