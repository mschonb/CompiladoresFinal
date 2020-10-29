# CompiladoresFinal
Examen final de compiladores

# GraphQL

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
        id,
        nombre,
        color_ojos,
    }
}
```
Es necesario recalcar que GraphQL no es una tecnología de bases de datos, si no es un **lenguaje de consultas para APIs**. Lo que al final viene siendo una de sus grandes ventajas porque no está casado con ningún DBMS y puede ser utilizado en cualquier entorno en donde se usen APIs.

## Beneficios