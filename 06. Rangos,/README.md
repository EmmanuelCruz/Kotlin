# Rangos.
## Emmanuel Cruz Hernández

----

### Descripción
Uso de rangos en Kotlin y diferentes formas de aplicación en un if y en un for.

----

### Rangos
Los rangos se definen con un valor inicial del comienzo del rango, seguido de dos puntos y finalmente el valor final del rango.

		int1..int2

Los rangos permiten definir ciertos números como una estructura. Se pueden usar dentro del controlador ***for*** y el controlador ***if*** para verificar si un número se encuentra en un rango. Por ejemplo:

		if(verificado in 4..9){
			println("Si está contenido en el rango")
		} else{
			println("No está contenido en el rango")
		}

Dentro del controlador for, permite recorrer como se describe en la sección de [Controladores de Flujo](https://github.com/EmmanuelCruz/Kotlin/blob/master/05.%20Controladores%20de%20Flujo/README.md)

**Importante**: Los rangos sólo trabajan de forma ascendente. Es decir, no puedo tener un rango declarado como 7..2, ya que sería un rango vacío.

#### Uso de downTo

Para que un rango trabaje de forma descendiente se utiliza la palabra reservada ***downTo*** que especifica que se toman los valores de un rango de mayor a menor.

		for(iter in 7 downTo 2){
			println(iter)
		}

En este caso, imprimiría los valores de 7 a 2. Recorriendo de esta forma un rango de forma descendiente.

#### Uso de step

Como habrán notado, los rangos dentro de un for se recorren en una unidad por iteración. Para recorrer de más de una unidad se utiliza la palabra reservada ***step*** de la siguiente forma:

		for(paso in 2..20 step 2){
			println(paso)
		}

En el ejemplo anterior, se recorre del 2 al 20 en saltos de dos. Por lo que el resultado en consola sería 2, 4, 6, ..., 20.

### Uso de Until

Los rangos toman los valores definidos del primer valor a exactamente el último valor definido. La palabra reservada ***until*** excluye el último valor del rango.

		for(excluido in 2 until 6){
			println(excluido)	
		}

En el ejemplo anterior, se imprimen los valores de 2 a 5. Nótese que el 6 ya no forma parte del recorrido del for.

----

### Correr y compilar

Para compilar en Kotlin

```
kotlinc -include-runtime rangos.kt -d rangos.jar
```

El comando anterior, crea un archivo ***.jar*** que puede correr con el comando siguiente

```
kotlin rangos.jar
```

Otra opción para correr el programa es

```
java -jar rangos.jar
```
