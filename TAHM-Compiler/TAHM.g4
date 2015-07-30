grammar TAHM;

program
  : block DOT
  ;

block
  : vars? procedure* statement
  ;
  
vars
  : VAR Ident (COMMA Ident)* SEMIC
  ;

procedure
  : PROCEDURE Ident SEMIC block SEMIC
  ;

statement
  : ASSIGN Ident expression                 # assignStat
  | PRINT Ident                              # printStat
  | NOT Ident                              # notStat
  | START statement SEMIC (statement SEMIC)* QUIT  # beginStat
  | IF condition THEN statement             # ifStat
  | WHILE condition DO statement            # whileStat
  ;

condition
  : ODD expression
  | expression op=(IS|LESS_THAN|GREATER_THAN) expression
  ;

expression
  : opt_sign=(PLUS|MINUS)? term (opt_term)*
  ;
  
opt_term
  : op=(PLUS|MINUS) term
  ;

term
  : factor (opt_factor)*
  ;
  
opt_factor
  : op=(MULT|DIV) factor
  ;

factor
  : Ident                 # identFactor
  | Number                # numberFactor
  | OPEN expression CLOSE  # parExpr
  ;

START : 'turn_up' ;
QUIT : 'bye_felicia' ;
IS : '==' ;
NOT : '!' ;
DO: 'work' ;
ODD : 'odd' ;
ASSIGN : 'call' ;
COMMA : ',' ;
SEMIC : ';' ;
DOT : '.' ;
VAR : 'make' ;
IF : 'when' ;
THEN : 'then' ;
PRINT : 'spitfire';
ELSE : 'nah' ;
WHILE : 'finna' ;
EQUAL_TO : 'is' ;
GREATER_THAN : 'mo' ;
LESS_THAN : 'turn_down' ;
PROCEDURE : 'go' ;
OPEN : '(' ;
CLOSE : ')' ;
PLUS : '+' ;
MINUS : '-' ;
MULT : '*' ;
DIV : '/' ;

Ident  : ALPHA (ALPHA | DIGIT)* ;
Number : DIGIT+ ;

ALPHA : 'a'..'z' | 'A'..'Z' ;
DIGIT : '0'..'9' ;

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
