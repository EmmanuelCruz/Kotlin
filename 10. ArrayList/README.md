# ArrayList.
## Emmanuel Cruz Hernández

----

### ArrayList

Es una estructura de datos que se comporta como una lista pero su implementación está basada en un arreglo (Array).

#### Crear un ArrayList
La creación de un ArrayList se compone de la palabra _ArrayList_, seguido del tipo de los elementos que estarán contenidos en la estructura.

		var datos:ArrayList<String> = ArrayList<String>()

Esta estructura tiene implementadas varias funciones para el manejo de una lista. Algunas se presentan a continuación con un ejemplo.

* Agregar elementos
	
		datos.add("Hola")

* Obtener elementos. Los rangos válidos van de 0 a la longitud de la lista menos uno.

		datos.get(0)

* Eliminar un elemento por contenido. Elimina el elemento que tenga el contenido que pasa como parámetro.

		datos.remove("Kotlin")

* Elimina el elemento en una posición específica de la lista. Los rangos válidos para eliminar van de 0 a longitud menos 1.

		datos.removeAt(2)
	
* Modificar el valor de un elemento específico de la lista.

		datos.set(0, "Adios")

* Limpiar una lista

		datos.clear()	

### Recorrido de una lista

Se puede utilizar un ciclo for para hacer el recorrido de los elmentos a forma de for each.

		for(dato in datos){
			println(dato)
		}

----

### Correr y compilar

Para compilar en Kotlin

```
kotlinc -include-runtime ArrayList.kt -d ArrayList.jar
```

El comando anterior, crea un archivo ***.jar*** que puede correr con el comando siguiente

```
kotlin ArrayList.jar
```

Otra opción para correr el programa es

```
java -jar ArrayList.jar
```
