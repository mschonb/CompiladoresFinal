grammar Graphql;

expr: querydef                                                          #queryexpr  |
      fragmentDef                                                       #fragexpr  
      ;

querydef: QUERY ID? ('('conditions')')? '{' table  ('(' conditions ')')? ('{'params'}')? '}' #defquery;

fragmentDef: 'fragment' ID 'on' table '{' params '}';

table: ID                                                               #tableDef
     ;


condition: value logop factor                                           #idOPval
        
        ;
factor: 
        value                                                           #factorValue       |
        value assignment value                                          #factorAssValue
        ;

assignment: '='                                                         #Defvar
          ;

conditions: condition ',' conditions                                    #conditionconditions |
        condition                                                       #singlecondition     |
                                                                        #emptycondition
            ;

logop: ':'                                                              #equalOP    |
       '_eq'                                                            #eqOP       |
       '_gt'                                                            #gtOP       |
       '_lt'                                                            #ltOP       |
       '_gte'                                                           #gteOP      |
       '_lte'                                                           #lteOP      
       ;


params:  param params                                                   #paramParams   |
         '{' param params '}'                                           #paramBrackets |
                                                                        #emptyParam
         ;

param:  introspection? (ID':')? ID ('(' conditions ')')?  directive?    #paramIDcond   |
        introspection? (ID':')? querydef directive?                     #exprParam     |
        introspection? fragmentQ  directive?                            #fragmentParam
    ;

value: variable | FLOAT | NUM | STRING | BOOLEAN | NULL | ID            
    ;

variable
    : '$' ID                                                            #variables
    ;

alias: ID ;

fragmentQ : '...' ID                                                    #fragmentID       |
            '...' 'on' table '{'params'}'                               #inlinefragment
            ;

directive: '@include' '(' 'if' ':' value ')'                            #includedirective |
           '@skip' '(' 'if' ':' value ')'                               #skipdirective
           ;
           
introspection: INTROSPECTION                                            #anyintrospection;

//terminales
INTROSPECTION: '__schema' | '__type' | '__typeKind' | '__field' | '__inputValue' | '__enumValue' | '__directive';
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
QUERY: 'query';
NUM: [0-9]+;
ID : [A-Za-z][_0-9A-Za-z]*;
WS      : [ \n\t\r]+ -> skip;
COMMENT: '#' ~[\r\n]* -> skip;