/**
 * @author Péter Ferenc Gyarmati
 * @id 11913446
 */
grammar BigCalcProg;

/* === PARSER === */
program : statement+ EOF  // A program is made up of at least one statement
        ;

statement
        : expression END_OF_STAT                                 # expressionStatement
        | assignment END_OF_STAT                                 # assignmentStatement
        ;

assignment
        : VAR OP_ASSIGN expression                               # varAssignment
        | VAR op=(OP_MUL
                | OP_DIV
                | OP_ADD
                | OP_SUB) OP_ASSIGN expression                   # compoundAssignment
        ;

expression  
        : PAR_LEFT expression PAR_RIGHT                          # parExpression
        | e1=expression '?' e2=expression ':' e3=expression      # ternaryExpression
        | ABS_SIGN expression ABS_SIGN                           # abs
        | op=(OP_ADD | OP_SUB) expression                        # plusMinus
        | left=expression OP_MOD right=expression                # mod
        | <assoc=right> left=expression OP_POW right=expression  # pow
        | left=expression op=(OP_MUL | OP_DIV) right=expression  # mulDiv
        | left=expression op=(OP_ADD | OP_SUB) right=expression  # addSub
        | val                                                    # value
        ;

val     : NUMBER                                                 # num
        | VAR                                                    # variable
        ;

/* === LEXER === */

// NUMBER definition should come before DIGIT to indicate the order of lexing for the lexer
NUMBER  : DIGIT* '.' DIGIT+  // Decimals potentially of the form .994 for 0.994
        | DIGIT* '.' DIGIT+ [eE] [+-]? DIGIT
        | DIGIT+             // Integers
        ;

DIGIT   : [0-9] ;

VAR : [a-zA-Z][0-9]* ;  // One lowercase or uppercase letter followed by 0 or more digits
OP_ASSIGN : '=' ;
OP_MUL : '*' ;
OP_DIV : '/' ;
OP_ADD : '+' ;
OP_SUB : '-' ;
OP_POW : '^' ;
OP_MOD : '%' ;
END_OF_STAT : ';' ;
PAR_LEFT : '(' ;
PAR_RIGHT : ')' ;
ABS_SIGN : '|' ;
NOTHING : [^$];

WS      : [ \t\r\n\u000C]+ -> skip  // ignore whitepaces
        ;

COMMENT :   '/*' .*? '*/' -> skip  // ignore multi-line comments
        ;

LINE_COMMENT
        : '//' ~[\r\n]* -> skip  // ignore line comments
        ;