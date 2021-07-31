# Controladores de Flujo.
## Emmanuel Cruz Hernández

----

### Descripción
Declaración y aplicación de los controladores de flujo condicionales, iterativos y secuenciales.

#### Controlador **when**
Es un controlador secuencial que permite elegir una de varias opciones de código a ejecutar.
	
		when(value){
			18 -> println("Se eligió el 18")
			20 -> println("Se eligió el 20")
			34 -> println("Se eligió el 34")
			10 -> println("Se eligió el 10")
		}

En caso de no caer en algún caso, no se ejecuta ninguna de las opciones de código.
Sin embargo, existe una forma de poner código por defecto que se ejecuta en caso de no caer en los casos anteriores usando la siguiente sintaxis:

		else -> println("Caso no definido")

Una ventaja de este controlador, es que se pueden agrupar valores dentro de los casos.

		when(value){
			18, 19 -> println("Se eligió el 18 o 19")
			20, 21 -> println("Se eligió el 20 o 21")
			34, 35, 36 -> println("Se eligió el 34, 35 o 36")
			10 -> println("Se eligió el 10")
			else -> println("Caso no definido")
		}

Finalmente, la forma anterior sólo funciona para casos donde se ejecuta una sola línea de código. Para ejecutar más líneas se utiliza un bloque { } de la siguiente forma:

		when(value){
			18, 19 -> {
				println("Se eligió el 18 ")
				println("o 19")
			}
			20, 21 -> {
				println("Se eligió el 20 ")
				println("o el 21")
			}
			34, 35, 36 -> {
				println("Se eligió el 34 ")
				println("o el 35 ")
				println("o el 36")
			}
			10 -> println("Se eligió el 10")
			else -> println("Caso no definido")
		}

### Controlador For

ES un controlador iterativo que ejecuta cierto código una cantidad específica de veces.

		for(num in 0..100) {
			...
		}

En el ejemplo anterior, ejecuta las líneas de código dentro del bloque desde el 0 al 100, exactamente.

### Controlador While

Es otro controlador de flujo que ejecuta ciertas líneas de código siempre que se cumpla una condición.

		while(condition){
			...
		}

### Controlador Do While

Es un controlador de flujo iterativo similar al while, pero este ejecuta las líneas de código dentro del bloque ***do*** al menos una vez. Independientemente si se cumple o no la condición, el código se ejecuta al menos una vez.

		do{
			...
		} while(condition)
		
Seguirá ejecutando las líneas del bloque ***do*** siempre que se cumpla la condición.

----

### Correr y compilar

Para compilar en Kotlin

```
kotlinc -include-runtime controladores.kt -d controladores.jar
```

El comando anterior, crea un archivo ***.jar*** que puede correr con el comando siguiente

```
kotlin controladores.jar
```

Otra opción para correr el programa es

```
java -jar controladores.jar
```
