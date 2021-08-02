# Enumeradores.
## Emmanuel Cruz Hernández

----

### Descripción
Los enumeradores son una colección de constantes que se utilizan dentro de un programa.

----

### Enumeradores
Se declaran con la palabra reservada ***enum*** seguido de la definición de una clase y el nombre que los representa. Dentro del cuerpo de la clase, se enlistan los enumeradores válidos utilizando letras mayúsculas.

Los enumeradores también pueden recibir una propiedad como parámetro y definir un valor concreto a cada uno de los valores de la enumeración.

Los parámetros en Kotlin se ingresan de la siguiente forma:

		(var nombreVariable:Typo)
		
Por ejemplo:

		(var nombreMes:String)

Para asignar el valor, se ingresa dentro de un paréntesis como valor concreto asosciado al valor de la enumeración:

		enum class Meses(var nombre:String){
			ENE("Enero"), FEB("Febrero"), MAR("Marzo"), ABR("Abrirl"), MAY("Mayo"), JUN("Junio"), 
			JUL("Julio"), AGO("Agosto"), SEP("Septiembre"), OCT("Octubre"), NOV("Noviembre"), DIC("Diciembre")
		}

También se pueden agregar funciones a una enumeración, la definición de estos con los enumerandos es separados por una coma, seguido de la definción de las funciones.

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
