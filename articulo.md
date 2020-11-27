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

## Resultados Obtenidos

## Conclusiones y trabajos futuros

## Bibliografía