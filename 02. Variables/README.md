# Variables en Kotlin
## Emmanuel Cruz Hernández.

----

### Descripción
En kotlin las variables son definidas con la palabra reservada ***var***, seguido del nombre de la variable y su valor. Sin embargo, el tipo de datos también puede ser especificado, después del nombre de la variable.

		var entero:Int = 20

**Lo cual es buena práctica.**

### Tipos de datos

* Int
		var entero:Int = 43
* String
		var cadena:String = "Hola mundo"
* Double
		var doble:Double = 3.4
* Float
		var flotante:Float = 34.87F
* Char
		var caracter:Char = 'C'
* Boolean
		var booleanoV:Boolean = true
		var booleanoF:Boolean = false
		
### Palabra reservada **val**
Las palabras reservadas ***var*** y ***val*** funcionan para declarar variables. Sin embargo, el valor inicial que se asigna cuando se usa la palabra reservada ***val*** no cambia durante toda la ejecución del programa. Su uso y aplicación es similar a la palabra ***final*** en Java.

### Conversión de tipos
La conversión de tipos es muy sencilla. Utiliza los métos ***to*** seguido del tipo al que se quiere hacer la conversión. Por ejemplo, para convertir de String a entero se utilizaría **toInt()**, para convertir de String a float se usaría **toFloat()**, etc.

### Manejo de nulos en Kotlin
En este lenguaje de programación no se permiten nulos como tal, es decir, no existe algún tipo de datos ***null***, ***None*** o alguna palabra similar para representar nulos.
sin embargo, existe un operador que permite dar un valor nulo a una variable, este operador se representa por el caracter **?**. 

		var nulo:Int? = null

En caso de no utilizar el operador, se muestra el siguiente error

		null can not be a value of a non-null type Int

----

### Correr y compilar

Para compilar en Kotlin

```
kotlinc -include-runtime variables.kt -d variables.jar
```

El comando anterior, crea un archivo ***.jar*** que puede correr con el comando siguiente

```
kotlin variables.jar
```

Otra opción para correr el programa es

```
java -jar variables.jar
```
