# Programación orientada a objetos.
## Emmanuel Cruz Hernández

----

### Programación orientada a Objetos en Kotlin

La programación orientada a objetos (POO) es un paradigma que se basa en tratar la abstracción de un modelo como un objeto, que cumple ciertas características llamados atributos y comportamientos llamadas ***funciones***.

### Declarar una clase

Una clase se define con la palabra reservada _class_, seguido del nombre de la clase y opcionalmente, algunos atributos iniciales que pasan por default en los parámetros de la clase.

		class NombreClase(atributo1:tipo1, atributo2:tipo2, ...) {
			...
		}

Algo importante a resaltar, es que estos parámetros no se almacenan al momento de crear la clase. Para almacenarlo, se debe hacer la asignación directamente en la función de inicio. Esta se define por la palabra reservada _init_.

Otra forma de definir una clase, es omitiendo los parámetros opcionales

		class NombreClase() {
			...
		}

### Init y Constructor

La función de inicio es aquella que se ejecuta cada vez que se crea un nuevo objeto. Esta forma de inicializar se utiliza para clases que no tienen una estructura compleja.

		init {
			...
		}

Cuando una clase toma una estructura mucho más compleja, se suele utilizar en mayor medida la función constructora.

		constructor (atributo1:tipo1, atributo2:tipo2, ...):this(){
			...
		}

Nótese que esta función constructora regresa un ojeto, como las funciones convencionales que se vieron anteriormente. Sin embargo, el objeto de regreso es tal cual el objeto que se está creando. Se puede tener acceso a este objeto con la palabra reservada _this_.

### Detalle sobre Getters y Setters

En Kotlin, estas funciones se definen comenzando por una letra mayúscula, seguido de la escritura _Camel Case_.

----

### Correr y compilar

Para compilar en Kotlin

```
kotlinc -include-runtime Auto.kt -d Auto.jar
```

El comando anterior, crea un archivo ***.jar*** que puede correr con el comando siguiente

```
kotlin Auto.jar
```

Otra opción para correr el programa es

```
java -jar Auto.jar
```
