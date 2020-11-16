# Gramática GraphQL

## Producciones

### Explicaciones
#### expr: símbolo inicial
~~~expr: '{'table ('(' conditions ')')? ('{' params '}')? '}'; ~~~:

Como el alcance del DSL que estamos realizando se reduce a queries, no tomamos en cuenta mutaciones, por lo que un documento de GraphQL toma en cuenta la tabla sobre la cual estamos haciendo consultas, las condiciones de búsqueda y los parámetros que queremos obtener.

#### Definición de tablas
~~~table: ID;~~~

Una tabla se define como un ID que va antes de los paréntesis de condiciones.

#### Condiciones
~~~conditions: condition conditions  | ;~~~
las condiciones de búsqueda pueden ser varias, o pueden no existir (obtener todo)

~~~condition: ID logop ID| ID logop NUM;~~~
Las condiciones se definen con una operación lógica de por medio

#### Operaciones Lógicas
Las operaciones lógicas definidas en la gramática son:
- **":"** se trata del operador lógico de la igualdad (también definimos a **"_eq"**, símbolo equivalente)
- **"_gt y _lt"** Operadores lógicos pára desigualdad
- **"_lte y _gte"** Operadores lógicos para desigualdad (o igualdad)

#### Parámetros
Los parámetros de una consulta permiten proyectar los resultados que queremos obtener. De ésta forma, podemos tener 0 o más parámetros.

~~~params: param params;~~~

~~~param: ID ('(' conditions ')')? | expr;~~~
Los parámetros pueden ser ciertos campos de algun atributo de la tabla, que podemos condicionar opcionalmente, y proyectar a otras tablas (Es por eso que volvemos a ver expr en esta producción)


## Referencias
Nos basamos principalmente en el siguiente repositorio:
 

