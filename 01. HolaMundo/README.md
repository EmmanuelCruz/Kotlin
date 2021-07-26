# Hola Mundo.

## Autor: Emmanuel Cruz Hernández

----

### Descripción
Cómo en casi todo lenguaje de programación, el primer ejemplo es realizar un ***Hola mundo***, que consiste en imprimir en consola un mensaje puesto desde el lenguaje de programación, en este caso, Kotlin.

----

### Correr y compilar

Para compilar en Kotlin

```
kotlinc -include-runtime HolaMundo.kt -d HolaMundo.jar
```

El comando anterior, crea un archivo ***.jar*** que puede correr con el comando siguiente

```
kotlin HolaMundo.jar
```

Otra opción para correr el programa es

```
java -jar HolaMundo.jar
```