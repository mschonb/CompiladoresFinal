# Artículo de investigación

## Autores

//compilen el pdf con (necesitan pandoc y pandoc-citeproc) brew en mac y apt en linux 
> ```pandoc --filter pandoc-citeproc --bibliography=referencias.bib --variable papersize=a4paper -s articulo.md -o articulo.pdf```  

Yann Le Lorier  
Marcelo Schonbrunn  
Fernando  
Simón Metta  
Isaac Harari  
Christian Dalma  

## Resumen

Con este proyecto, proponemos un traductor de consultas que permite pasar de GraphQL a SQL, basado en ANTLR y algunas clases diseñadas para procesar distintos tipos de datos como ```FLOAT```, ```STRING```, entre otros, con condiciones y proyecciones.

## Introducción

El uso de bases de datos se ha diversificado a lo largo de los años. Por lo tanto, no es raro ver proyectos que utilizan varias bases de datos. Un caso de uso común sería (simultáneamente):

- Una base de datos para la administración de los usuarios en una página web (como Redis)
- Otra base de datos para el monitoreo de actividad dentro de una aplicación web

Por lo tanto, es importante hablar de GraphQL. Se trata de un DSL que puede ser adaptado a cualquier tipo de base de datos, independientemente de su sintaxis, podemos realizar traducciones de GraphQL a SQL y a otros DSLs. Esto implica que ya no tenemos que estar pensando en administrar diferentes DSLs para las numerosas Bases de datos que estamos manejando en nuestro proyecto.

## Estado del arte

De acuerdo con la página de [GraphQL](https://graphql.org/learn/), Esta herramienta es un lenguaje de consultas, hecho específicamente para las APIs de las aplicaciones. El principal beneficio estando en que no está atado a alguna base de datos específica o algún motor de almacenamiento.

Al momento de escritura, GraphQL ofrece soporte para los siguientes lenguajes:

- JavaScript
- Go
- PHP
- Python
- Java/Kotlin
- C#/.NET
- Ruby
- Elixir
- Rust
- Swift/Objective-C
- Scala
- Flutter
- Clojure
- C/C++
- Elm
- OCaml/Reason
- Haskell
- Erlang
- Groovy
- R
- Julia
- Perl
- D

Se puede obtener más información sobre el soporte de cada lenguaje con esta herramienta en el siguiente [enlace](https://graphql.org/code/#languages).  
Es posible analizar el estado de GraphQL al analizar la fundación GraphQL, que apoya las contribuciones del aprendizaje de nuevas tecnologías, construcción de nuevas contribuciones tecnológicas, así como para ofrecer soporte para GraphQL, todo con el apoyo de la Linux Foundation.  
El razonamiento detrás de esta tecnología es que estamos moviéndonos hacia una arquitectura orientada a microservicios. Toda la información de (@graphql)

## Desarrollo
Para poder realizar un query de forma correcta es muy importante llegar a comprender cómo este programa logra traducir la entrada hecha a base de la gramática de GraphQL y traducirla a un ejecutable que toma la forma de una cadena en lenguaje SQL. Primero vino la creación del archivo g4, es decir la gramática que se obtiene a partir de la entrada dada y la descomposición de esta misma para la generación de micro bloques los cuales afectarán de forma distinta al programa. Posteriormente nos encontramos con los programas realizados en java, principalmente nuestro archivo que funciona como listener del programa, propiamente llamado 'MiListener.java', a diferencia del archivo g4, el cual deconstruye la entrada, este listener utiliza los bloques generados a partir de los diferentes elementos encontrados en el input poco a poco va concatenando un string el cual simula una relación directa entre la gramática propuesta en GraphQL y SQL. En pocas palabras, el g4 deconstruye la entrada y el listener genera un string SQL a partir de esta de construcción.

### g4
Para el g4 principalmente se tiene una expresión *expr* la cual produce un *query* o *fragmentDef*, los cuales explicaremos más tarde. De *expr* se deriva toda la gramática. Por un decir, *expr* es el corazón de la parte léxica.

Se tiene que un *query* comienza con la palabra 'query', la cual le puede seguir un ID que es una palabra. Este ID para efectos de SQL no es útil por lo que realizar consultas con un ID para SQL es simplemente introducir ruido en la consulta de base de datos. Posteriormente, en el query pueden venir condiciones. En caso de que venga una condición antes de un *queryblock*, el cual explicaremos más adelante, es porque se desea realizar un INNER JOIN.
Las condiciones (*condition* en la gramática) son muy importantes a la hora de realizar una consulta en la base de datos. Estas ayudan a filtrar los registros que se desean obtener. Un ejemplo de esto es el siguiente: Se tiene una base de datos con las películas de toda la historia, y queremos solamente las películas en las que Quentin Tarantino fue el director de la película. La gramática maneja la posibilidad de manejar varias condiciones. Agarrándose del caso pasado, queremos obtener las películas las cuales su género es Miedo y el año en que se filmó es mayor a 1998. Asimismo, para las condiciones se puede incluir una variable a la que se le compara con el atributo de la tabla.

Para realizar una consulta se tienen esencialmente dos casos, una consulta sobre una tabla con la opción de *n* cantidad de filtros o la opción de realizar un INNER JOIN entre dos en el cual se entrega el producto cartesiano donde los atributos correspondientes a cada tabla tengan el mismo valor. 
- Consulta básica sobre una tabla:
En este caso, el usuario solamente desea ver registros de una sola tabla con la opción de filtros y proyectando los atributos que desea. Primero se debe de escribir la palabra 'query' seguido de el *queryblock*. Después el nombre de la tabla (con la opción de que tenga un aligas) y con la opción de que agregue filtros dentro de paréntesis. Por último las proyecciones (con la opción de que tengan aliases) encapsuladas en '{}'.

- INNER JOIN entre dos tablas: 
El INNER JOIN, en SQL, sirve para hacer una consulta en donde un atributo de una tabla tenga el mismo valor que el de un atributo de otra tabla. El resultado es el producto cartesiano de las tablas. Para lograr esto, primero se debe de escribir la palabra 'query', seguido de los nombres de los atributos de las tablas los cuales se van a comparar, es decir, donde el valor de ambos atributos de las tablas sea el mismo. Posterior a eso se debe de incluir entre '{}' los *queryblocks* de las dos tablas los cuales pueden llevar condiciones al. La forma de escribir el *queryblock* es el nombre de la tabla (con la opción de que tenga un aligas) y con la opción de que agregue filtros dentro de paréntesis y sus proyecciones dentro de '{}'. Al final se pone la segunda tabla de la misma forma. Es pertinente mencionar que solamente se puede realizar un INNER JOIN por consulta.

Los filtros se pueden ubicar en el g4 como los *logop*. Para los filtros se pueden hacer las siguientes operaciones lógicas. Para los ejemplos de cada operador lógico se tiene una tabla llamada 'movies' que tiene id, nombre, protagonista y anio_filmada
- ':': Si una variable es igual a un valor
  - SELECT FROM movies WHERE nombre='Joker'
- '_eq': Si una variable es igual a un valor
  - SELECT FROM movies WHERE nombre='Joker'
- '_gt': Si una variable es mayor a un valor
  - SELECT FROM movies WHERE anio_filmada>1990
- '_lt': Si una variable es menor a un valor
  - SELECT FROM movies WHERE anio_filmada<1990
- '_gte': Si una variable es mayor o igual a un valor
  - SELECT FROM movies WHERE anio_filmada>=1990
- '_lte': Si una variable es menor o igual a un valor
  - SELECT FROM movies WHERE anio_filmada<=1990

Para realizar las proyecciones, existe un productor importante llamado *params* que produce *param params*. Las proyecciones son las columnas o los nombres de los atributos especificados que el query debe de regresar. Por ejemplo en la siguiente consulta de SQL **SELECT a, b, c FROM foobar WHERE x=3;** la proyección es **SELECT a, b, c FROM foobar**. Solamente se desea recuperar **a**, **b** y **c** de la tabla **foobar**.

Se pueden escribir comentarios cuando se desea realizar la traducción pero simplemente se ignoran, es decir, no se incluyen en el resultado.

### Creación de query


## Resultados Obtenidos


## Conclusiones y trabajos futuros

## Bibliografía

#### WHERE
La palabra 'WHERE' también es uno de los elementos fundamentales que se requieren utilizar a la hora de realizar consultas, este funciona simplemente como un filtro a partir de la selección que se desea obtener, un ejemplo claro de esto es requerir una tupla en la tabla la cual esta asignada a algún identificador especifico o únicamente llamar a las entradas que cumplen con cierto parámetro, ya sea gramático, lógico, matemático, etc.

#### AS
El 'AS' en SQL es únicamente una operación que facilita la comprensión y organización de las tablas que se desea obtener, esta operación únicamente genera un nombre alias para una columna o tabla en específico, esto sirve cuando dentro de múltiples tablas, las cuales uniremos con un 'INNER JOIN' contienen parámetros llamados de forma parecida, por ejemplo si 2 tablas contienen un una columna llamada 'nombre' o 'id' para poder identificarlos a partir de un nombre personal introducido por el usuario, también funciona para darle un nombre a una columna que normalmente no lo tendría, como lo seria el resultado de una columna que da a partir de una concatenación de otras columnas u operaciones matemáticas entre tuplas.
