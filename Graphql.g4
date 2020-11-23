grammar Graphql;
 
expr: query
    | fragmentDef
    ;
 
query: QUERY ID? ('('conditions')')? '{'queryblocks'}';
 
fragmentDef: 'fragment' ID 'on' table '{' params '}';
 
queryblocks: queryblock queryblocks
            |
            ;
 
queryblock: table ('('conditions')')? directive? '{' params '}';
 
 
conditions: condition ',' conditions
          | condition
          |
          ;
 
params: param params
      |
      ;
 
param: introspection? field ('('conditions')')? directive?  #ParamField
     | introspection? queryblock directive?                 #ParamQueryblock
     | introspection? fragmentQ directive?                  #ParamFragQ
     ;
 
fragmentQ : '...' ID                            #FragID
          | '...' 'on' table '{'params'}'       #FragOnParams
            ;
 
condition:  value logop factor      #CondValFact
         |                          #CondEpsilon
         ;
 
factor: value                       #FactorVal
      | value assignment value      #FactorValAssVal
      ;
 
assignment: '='
          ;
 
 
table: (alias ':')? ID;
 
alias: ID;
 
field: (alias ':')? ID;
 
value: variable #ValVal| FLOAT #ValFloat| NUM #ValNum| STRING #ValString| BOOLEAN #ValBool| NULL #ValNull| ID #ValID;


 
logop: ':'
       |'_eq'
       |'_gt'
       |'_lt'
       |'_gte'
       |'_lte'
       ;

variable: '$' ID;
 
directive: '@include' '(' 'if' ':' value ')'
         | '@skip' '(' 'if' ':' value ')'
         ;
introspection: INTROSPECTION;
 
QUERY: 'query';
INTROSPECTION: '__schema' | '__type' | '__typeKind' | '__field' | '__inputValue' | '__enumValue' | '__directive';
ID : [A-Za-z][_0-9A-Za-z]*;
NUM: [0-9]+;
WS: [ \n\t\r]+ -> skip;
COMMENT: '#' ~[\r\n]* -> skip;
FLOAT: NUM '.' NUM;
NULL: 'null';
STRING: '"' (ESCAPED_CHAR | ~["\\])* '"';
fragment ESCAPED_CHAR: '\\' ["\\/bfnrt];
BOOLEAN: 'true' | 'false';