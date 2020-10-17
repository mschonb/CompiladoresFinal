grammar TAC;


// Program -> [label:] Statement Program | EOF
// Statement -> Assignment | print Expression | halt | goto label
//              | BooleanExpr
// Expression -> Factor | Factor op Factor
// Factor -> id | boolean | flt
// Assignment -> id = Expression
// BooleanExpr -> if Expression Statement
//                 | iffalse Expression Statement

program: stmnts;

stmnts : stmnts stmnt           #StmntsStmnt
       |                        #EmptyStmnt
       ;

stmnt : (ID ':')? 'print' '(' acc ')'     #PrintAccStmnt
      | (ID ':')? 'print' '(' factor ')'  #PrintFactStmnt
      | (ID ':')? 'goto' ID               #GotoStmnt
      | (ID ':')? assignment              #AssStmnt
      //TODO: ifTrue and ifFalse label?
      | 'ifTrue' factor 'goto'  ID         #IfTrueStmnt
      | 'ifFalse' factor 'goto' ID        #IfFalseStmnt
      ;

op : factor '*' factor          #MultOperator
   | factor '/' factor          #DivOperator
   | factor '+' factor          #PlusOperator
   | factor '-' factor          #MinusOperator
   | factor '<' factor          #RelationalOperator
   ;

factor : ID                     #IdFact
       | NUM                    #NumFact
       ;

acc : ID                          #IDAcc
    | ID '[' factor ']'           #ArrayAcc
    ;

assignment : acc '=' op        #AssignmentOp
           | acc '=' factor    #AssignmentFact
           ;


//Base types


NUM : [0-9]+;
//BOOLEAN : 'True'|'False';
ID : [A-Za-z][0-9A-Za-z]*;
WS: [ \t\r\n]+ -> skip;

//f = 1
//n = 1
//repeat: t1 = n < 5
//ifFalse t1 goto end
//f = f * n
//n = n + 1
//goto repeat
//end: print(f)
