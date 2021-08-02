# Excepciones.
## Emmanuel Cruz Hernández

----

### Descripción
Definición y aplicación de excepciones en un programa en kotlin.

----

### Excepciones
Las excepciones en Kotlin, heredan de la clase **Throwable**. Pueden ser lanzadas y cachadas como lo hace _Java_.
Para lanzar una excepción se utiliza la siguiente sintaxis:

		throw Exception("Mensaje")

Para atrapar una excepción y manejarla se utiliza el bloque try, catch. La sintaxis es muetra a continuación:

		try{
			// Codigo
		} catch(e1: Exception1){
			// Manejo de la excepción 1
		} catch(en: ExceptionN){
			// Manejo de excepciónN
		} finally{
			// Bloque opcional 
		}

Se pueden tener varios bloques catch, para atrapar distinto tipo de excepciones que se pueden presentar en el bloque _try_.
El bloque _finally_ se ejecuta al terminar la ejecución de un try o un catch. Independientemente de si ocurre una excepción, este bloque formará parte de la ejecución del programa.

----

### Correr y compilar

Para compilar en Kotlin

```
kotlinc -include-runtime excepciones.kt -d excepciones.jar
```

El comando anterior, crea un archivo ***.jar*** que puede correr con el comando siguiente

```
kotlin excepciones.jar
```

Otra opción para correr el programa es

```
java -jar excepciones.jar
```
