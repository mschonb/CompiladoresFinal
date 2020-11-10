grammar Graphql;

expr: table ('(' conditions ')')? ('{' params '}')?;

table: ID;

conditions: condition conditions |
            ;

condition: ID logop ID     #idOPid     |
           ID logop NUM    #idOPnum     
        ;


logop: ':'          #equalOP    |
       ID'_eq'      #eqOP       |
       ID'_gt'      #gtOP       |
       ID'_lt'      #ltOP       |
       ID'_gte'     #gteOP      |
       ID'_lte'     #lteOP
       ;

params: param params |
    ;

param: ID ('(' conditions ')')? |
       expr
    ;


ID: [a-zA-Z][a-zA-Z0-9]*;

NUM: [0-9]+;