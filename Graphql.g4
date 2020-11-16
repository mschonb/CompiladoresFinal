grammar Graphql;

expr: '{' WS? table WS?'}' WS? #exprDef;
//('(' conditions ')')? ('{'params'}')? '}' NEWLINE? #mainExpr;

table: ID #tableDef;

conditions: condition conditions  #ConditionCondition |
                                  #ConditionsEpsilon  
            ;

condition: ID logop ID            #idOPid           |
           ID logop NUM           #idOPnum     
        ;


logop: ':'                        #equalOP    |
       ID'_eq'                    #eqOP       |
       ID'_gt'                    #gtOP       |
       ID'_lt'                    #ltOP       |
       ID'_gte'                   #gteOP      |
       ID'_lte'                   #lteOP
       ;

params: param params  NEWLINE?              #paramParams |
        '{' param '}' NEWLINE?             #paramBrackets
    ;

param: ID ('(' conditions ')')?   #paramIDcond |
       expr                       #exprParam
    ;

NUM: [0-9]+;
NEWLINE : [\n\r]+ ;
//INT     : DIGIT+ ;
DIGIT   : [0-9];
ID      : LETTER (DIGIT | LETTER)*[_]*;
LETTER  : [A-Za-z];
WS      : [ \n\t\r]+ -> skip;
