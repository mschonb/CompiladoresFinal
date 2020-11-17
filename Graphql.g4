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
 
param: introspection? field ('('conditions')')? directive?
     | introspection? queryblock directive?
     | introspection? fragmentQ directive?
     ;
 
fragmentQ : '...' ID
          | '...' 'on' table '{'params'}'
            ;
 
condition:  value logop factor
         |
         ;
 
factor: value
      | value assignment value
      ;
 
assignment: '='
          ;
 
 
table: (alias ':')? ID;
 
alias: ID;
 
field: (alias ':')? ID;
 
value: variable | FLOAT | NUM | STRING | BOOLEAN | NULL | ID;


 
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