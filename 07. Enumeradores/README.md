# Enumeradores.
## Emmanuel Cruz Hernández

----

### Descripción
Los enumeradores son una colección de constantes que se utilizan dentro de un programa.

----

### Enumeradores
Se declaran con la palabra reservada ***enum*** seguido de la definición de una clase y el nombre que los representa. Dentro del cuerpo de la clase, se enlistan los enumeradores válidos utilizando letras mayúsculas.

		


----

### Correr y compilar

Para compilar en Kotlin

```
kotlinc -include-runtime enumeradores.kt -d enumeradores.jar
```

El comando anterior, crea un archivo ***.jar*** que puede correr con el comando siguiente

```
kotlin enumeradores.jar
```

Otra opción para correr el programa es

```
java -jar enumeradores.jar
```
