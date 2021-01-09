grammar BigCalc;

/* === PARSER === */
program : statement+ EOF  // A program is made up of at least one statement
        ;

statement
        : expression END_OF_STAT                                 # expressionStatement
        | assignment END_OF_STAT                                 # assignmentStatement
        ;

assignment
        : VAR OP_ASSIGN expression
        ;

expression  
        : PAR_LEFT expression PAR_RIGHT                          # parExpression
        | op=(OP_ADD | OP_SUB) expression                        # plusMinus
        | left=expression op=(OP_MUL | OP_DIV) right=expression  # mulDiv
        | left=expression op=(OP_ADD | OP_SUB) right=expression  # addSub
        | NUMBER                                                 # num
        | VAR                                                    # variable
        ;


/* === LEXER === */
NUMBER  : DIGIT* '.' DIGIT+  // Decimals potentially of the forn .994 for 0.994
        | DIGIT+             // Integers
        ;

DIGIT   : [0-9]
        ;

WS      : [ \t\r\n\u000C]+ -> skip
        ;

COMMENT :   '/*' .*? '*/' -> skip
        ;

LINE_COMMENT
        : '//' ~[\r\n]* -> skip
        ;

VAR     : [a-zA-Z][0-9]*  // One lowercase or uppercase letter followed by 0 or more digits
        ;

OP_ASSIGN : '=' ;
OP_MUL : '*' ;
OP_DIV : '/' ;
OP_ADD : '+' ;
OP_SUB : '-' ;
END_OF_STAT : ';' ;
PAR_LEFT : '(';
PAR_RIGHT : ')';