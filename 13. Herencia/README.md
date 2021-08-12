# Herencia.
## Emmanuel Cruz Hernández

----

### Herencia

La herencia es la facultad de poder tomar los comportamientos y características de una clase a otra. Esta relación entre clases se conoce como padre e hija. La clase padre es aquella que da la definición de su estructura para que la clase hija tenga acceso a esta.

### Definir herencia en Kotlin

Para definir la herencia en una clase, se utiliza la siguiente sintaxis.

		class Clase:ClasePadre(){
			...
		}

Sin embargo, en Kotlin se debe especificar que una clase se va a tratar como una clase padre. La especificación se hace con la palabra reservada _open_.

		open class ClasePadre() {
			...
		}

Cabe mencionar, que esta palabra reservada no afecta el comportamiento de la clase padre.

### Sobreescribir funciones

En una clase hija se puede implementar una función que tenga exactamente la misma firma que una función definida en la clase padre. A esto se le conoce como sobreescribir una función y se toma en cuenta la función de la clase hija.

En Kotlin, estos cambios se deben definir en el código. La función de la clase padre, debe llevar el modificador _open_ en su definición de la siguiente forma

		open fun funcion(v1:tipo1, v2:tipo2, ...): tipoRegreso {
			...
		}

Y en la función que se sobreescribe en la clase hija, se utiliza el modificador _override_.

		override fun funcion(v1:tipo1, v2:tipo2, ...): tipoRegreso {
			...
		}

En caso de no definir alguna de estas etiquetas, se lanzará un error al momento de compilar.

----

### Correr y compilar

Para compilar en Kotlin

```
kotlinc -include-runtime Matematicas.kt -d Matematicas.jar
```

El comando anterior, crea un archivo ***.jar*** que puede correr con el comando siguiente

```
kotlin Matematicas.jar
```

Otra opción para correr el programa es

```
java -jar Matematicas.jar
```
