grammar TAC;

expr: querydef              #queryexpr|
      fragmentDef           #fragexpr
      ;

querydef: QUERY ID? ('('conditions')')? '{' (params?  '('conditions')'?)* '}' #defquery;

fragmentDef: 'fragment' ID 'on' table '{' params '}';

table: (alias':')? ID                   #tableDef
     ;


condition: value logop value           #idOPval
           ;

conditions: condition ',' conditions    #conditionconditions |
            condition                   #singlecondition     |
                                        #emptycondition
            ;

logop: ':'                          #equalOP    |
       '_eq'                        #eqOP       |
       '_gt'                        #gtOP       |
       '_lt'                        #ltOP       |
       '_gte'                       #gteOP      |
       '_lte'                       #lteOP
       ;

params:  param params               #paramParams |
         '{' param params '}'       #paramBrackets |
                                    #emptyParam
         ;

param:  INTROSPECTION? (alias':')? ID ('(' conditions ')')?  directive? #paramIDcond   |
        INTROSPECTION? (alias':')? querydef directive?                  #exprParam     |
        INTROSPECTION? fragmentQ  directive?                            #fragmentParam
    ;

value
    : variable | FLOAT | NUM | STRING | BOOLEAN | NULL | ID
    ;

variable
    : '$' ID
    ;

BOOLEAN
    : 'true' | 'false'
    ;

FLOAT
    : NUM '.' NUM
    ;

NULL
    : 'null'
    ;

STRING
    : '"' (ESCAPED_CHAR | ~["\\])* '"'
    ;

fragment ESCAPED_CHAR
    : '\\' ["\\/bfnrt]
    ;


alias: ID ;

fragmentQ : '...' ID                      #fragmentID   |
            '...' 'on' table '{'params'}' #inlinefragment
            ;

directive: '@include' '(' 'if' ':' value ')'   #includedirective |
           '@skip' '(' 'if' ':' value ')'      #skipdirective
           ;

INTROSPECTION: '__schema' | '__type' | '__typeKind' | '__field' | '__inputValue' | '__enumValue' | '__directive';
QUERY: 'query';
NUM: [0-9]+;
ID : [A-Za-z][_0-9A-Za-z]*;
WS      : [ \n\t\r]+ -> skip;
COMMENT
    : '#' ~[\r\n]* -> skip
    ;

