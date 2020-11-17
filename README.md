# CompiladoresFinal

Examen final de compiladores

# GraphQL

## Equipo

Christian Dalma SchultzA01423166 \
Fernando A01335834 \
Marcelo Schonbrunn A01207573 \
Isaac Harari A01024688 \
Yann Le Lorier Bárcena A01025977 \
Simon Metta A01377925

## Qué es

GraphQL es un lenguaje de consultas que permite escribir consultas utilizando un consultas basadas en objetos, a diferencia de SQL que se escriben cadenas de texto. Este nuevo lenguaje de consultas está más enfocado a facilitar la evolución de las API con el tiempo. Asimismo, GraphQL permite a los clientes pedir y extraer exactamente lo que quieren a través de su API.

Por poner un ejemplo, imaginemos que se tiene una entidad Persona con los siguientes atributos:

- id
- nombre
- apellido
- color_ojos

Si deseamos recuperar el id, nombre y color_ojos de cada persona en SQL, la consulta sería:

```SQL
SELECT id, nombre, color_ojos FROM Persona
```

En cambio, con GraphQL se escribe el objeto del que se desea recuperar información y se enlistan los atributos que se desean recuperar, la consulta se escribe se la siguiente manera:

```GraphQL
{
    Persona {
        id
        nombre
        color_ojos
    }
}
```

Es necesario recalcar que GraphQL no es una tecnología de bases de datos, si no es un **lenguaje de consultas para APIs**. Lo que al final viene siendo una de sus grandes ventajas porque no está casado con ningún DBMS y puede ser utilizado en cualquier entorno en donde se usen APIs.

## Beneficios

Como mencionamos anteriormente, los beneficios de GraphQL se basan en su compatibilidad con muchos DBMS, ya que es un lenguaje general de consultas. Puede que un proyecto esté basado en Redis para guardar información de sesiones de clientes que acceden a una aplicación web, pero los registros de los clientes se guardan en MongoDB por ejemplo, o bien Neo4j. \
Esto implicaría administrar dos tipos de consultas distintas cuando se quiere acceder a la base de datos, por lo que usar GraphQL aumenta la portabilidad de las APIs escritas, creando así un programa predecible, que siempre actuará de la misma manera. \

Algunos beneficios concretos incluyen:

- Obtención preliminar de datos (sólamente los que necesitamos) en una aplicación Web
- Exploración de esquemas de Bases de datos usando GraphQL

## Desventajas

- El aprendizaje de nuevas APIs que utilizan GraphQL para tomar en cuenta en el /fetching/ de datos
- Como administrar requests del frontend usando GraphQL
- Diseñar cuidadosamente los esquemas de GraphQL para evitar malentendidos en la organización
