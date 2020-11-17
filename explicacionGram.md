# Gramática GraphQL

## Equipo

Christian Dalma SchultzA01423166 \
Fernando A01335834 \
Marcelo Schonbrunn A01207573 \
Isaac Harari A01024688 \
Yann Le Lorier Bárcena A01025977 \
Simon Metta A01377925

## Conceptos tomados en cuenta

- [x] Fields
- [x] Arguments
- [x] Aliases
- [x] Fragments
- [x] Operation name
- [x] Variables
- [x] Directives
- [x] Inline fragments
- [x] Meta fields

Información tomada de [GraphQL.org](https://graphql.org/learn/queries/)

## Producciones

```antlr
expr: query
    | fragmentDef
    ;
```

Una expresión para una consulta se puede ver como un fragmento (que puede ayudar a hacer la consulta de manera más simple) o bien un query.

Específicamente:

```antlr4
query: QUERY ID? ('('conditions')')? '{'queryblocks'}';
```

o bien:

```antlr4
fragmentDef: 'fragment' ID 'on' table '{' params '}';
```

Por nuestra definición de la gramática: \
**Para Query:**

- Siempre debemos de especificar el tipo de operación (sólo se acepta ```query```)
- Podemos agregarle un nombre a la operación con ```ID``` (opcional)
- Condiciones de búsqueda (```conditions```)
- los bloques de la consulta ```queryblocks``` (pueden ser más de 1)

**Para Fragment:**

- la palabra ```fragment``` para describir que estamos declarando un fragmento
- El nombre del fragmento con ```ID```
- ```on``` para saber en qué tabla operamos (```table```)
- ```params``` para las proyecciones.

## Sin entrar mucho a detalle

Nuestra gramática propuesta ofrece soporte para:

- introspecciones
- valores por default
- fragmentos (normales e ```inline```)
- directivas (```@skip``` y ```@include``` sólamente)
- Comentarios (son ignorados completamente)

## Algunos ejemplos para probar

```GraphQL
query {
  search(text: "an") {
    __typename
    ... on Human {
      name
    }
    ... on Droid {
      name
    }
    ... on Starship {
      name
    }
  }
}
```

```GraphQL
query HeroNameAndFriends($episode: Episode) {
  hero(episode: $episode) {
    name
    friends {
      name
    }
  }
}
```

```GraphQL
query HeroComparison($first: "hola") {
  empireHero:hero(episode: EMPIRE) {
    ...comparisonFields
  }
  jediHero:hero(episode: JEDI) {
    ...comparisonFields
  }
}
```

```GraphQL
query {
  empireHero: hero(episode: EMPIRE) {
    name
  }
  jediHero: hero(episode: JEDI) {
    name
  }
}
```

```GraphQL
query {
  human(id: "1000") {
    name
    height
  }
}
```

Declaración de fragmentos

```GraphQL
fragment comparisonFields on Character {
  name
  appearsIn
  friends {
    name
  }
}
```

## Referencias

Nos basamos principalmente en el siguiente repositorio, entendiendo minuciosamente los conceptos, y seleccionando lo que nos servía de: \
[charithe/GraphQL](https://github.com/charithe/antlr4-graphql/blob/master/GraphQL.g4)