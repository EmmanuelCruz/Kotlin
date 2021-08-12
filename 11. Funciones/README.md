# Funciones.
## Emmanuel Cruz Hernández

----

### Funciones

Las funciones son módulos que realizan una tarea específica a partir de un conjunto de parámetros y devuelve un resultado.

### Declarar funciones

Una función se compone de cuatro elementos básicos.
1. La palabra reservada _fun_.
2. El nombre de la función.
3. Parámetros de la función.
4. Tipo del dato de regreso.

Por ejemplo

		fun suma(num1:Int, num2:Int):Int {
			return num1+num2
		}

### Sobrecarga de funciones

La sobrecarga de una función se refiere a tener más de una función con el mismo nombre. La diferencia radica en la cantidad de parámetros o el tipo de datos que recibe la función. Podría sobrecargar la función _suma_ para que reciba dos parámetros de tipo _Double_ o hacer que reciba tres enteros. Cuando se invoca una función que se está sobrecargando, el compilador selecciona aquella que cumple con el tipo de los parámetros y con la cantidad.

Por ejemplo

		// Sobrecarga de funciones
		fun suma(num1:Double, num2:Double):Double{
			return num1 + num2
		}

		// Sobrecarga de funciones
		fun suma(num1:Int, num2:Int, num3:Int):Int {
			return num1+num2+num3
		}

Dependiendo de la invocación, se elegirá aquella que cumpla con las características de la invocación

		// Primera definición de suma. 2 enteros.
		suma(5, 10)
		
		// Segunda definción de suma. 2 doubles
		suma(3.4, 2.4)
		
		// Tercera definición de suma. 3 enteros.
		suma(3, 52, 3)
		
### Funciones como variables

En _Kotlin_ existe la posibilidad de almacenar una función dentro de una variable. La declaración es similar a una lambda.

Primer se define la variable donde se va a almacenar la declaración de la función. La implementación de la función está dentro de los caracteres { }. Los parámetros de la función se separan por una coma y se divide de la implementación por una flecha formada con los caracteres _->_. A diferencia de la definición de funciones clásica, esta no define un tipo de regreso.

		var saluda = {nombre:String -> "Hola! Saludos " + nombre}
		
		var concatena = {s1:String, s2:String -> "La concatenacion es : " + s1 + s2}

----

### Correr y compilar

Para compilar en Kotlin

```
kotlinc -include-runtime Funciones.kt -d Funciones.jar
```

El comando anterior, crea un archivo ***.jar*** que puede correr con el comando siguiente

```
kotlin Funciones.jar
```

Otra opción para correr el programa es

```
java -jar Funciones.jar
```
