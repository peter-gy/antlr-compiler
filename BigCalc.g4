grammar BigCalc;

program : statement+
        ;

statement
        : expression END_OF_STAT                # expressionStatement
        | assignment END_OF_STAT                # assignmentStatement
        ;

assignment
        : VAR ASSIGN_TO expression
        ;

expression  
        : expression op=(MUL | DIV) expression  # mulDiv
        | expression op=(ADD | SUB) expression  # addSub
        | NUMBER                                # num
        | VAR                                   # variable
        | PAR_LEFT expression PAR_RIGHT         # parExpression
        ;

NUMBER  : DIGIT* '.' DIGIT+
        | DIGIT+
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

VAR : [a-zA-Z][0-9]* ; // One lowercase or uppercase letter followed by 0 or more digits
END_OF_STAT : ';' ;
ASSIGN_TO : '=' ;
MUL : '*' ;
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
PAR_LEFT : '(';
PAR_RIGHT : ')';