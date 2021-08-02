# Arrays.
## Emmanuel Cruz Hernández

----

### Descripción


----

### Arrays

#### Declarando un Array
Un arreglo es una estructura que permite almacenar objetos del mismo tipo. La sintaxis de declaración es la siguiente:

		var nombreArreglo = Array<Type>(size, func)

Donde:
* _size_ corresponde a la cantidad de elementos que se pueden almacenar en el arreglo. Un arreglo **no es una estructura dinánica**. 
* _func_ corresponde a la función de llenado del arreglo.

Por ejemplo, si quisiera tener un arreglo de enteros cuyos elementos difieren en 1 unidad uno a uno, se define de la siguiente forma:

		var numeros = Array<Int>(5, {valor -> valor + 1})

Otra forma más sencilla de declaran un arreglo es la siguiente:

		var nombreArreglo = Array<Type>(size){0}

En este caso, se crea un arreglo pero cada una de sus entradas no está definida por una función, sino por un valor default en cada una de sus entradas. Nótese que al final de la declaración se encuentra entre llaves el valor default.

#### Índices de un Array
Los índices de acceso válido a un array van de 0 a la longitud del arreglo-1. Para acceder a cada uno de los índices, para consultar o modificar, se usa la siguiente sintaxis:

		nombreArreglo[pos]
		nombreArreglo[pos] = valor
		
Donde:
* **nombreArreglo**: Corresponde al nombre del arreglo que queremos manipular para acceder (como en el primer caso) o asignar un valor (como en el segundo caso).
* **pos**: Corresponde al índice del arreglo que queremos manipular. Los índices tienen un rango válido de 0 a la longitud menos una unidad.
* **valor**: Corresponde al valor de lo que se quiere almacenar en la posición _pos_ del arerglo _nombreArreglo_.

#### Longitud de un arreglo
Para obtener la longitud de un arreglo se utiliza el atributo _size_.
**Nótese que size no es una función, por lo que no es necesario poner paréntesis**.

		nombreArreglo.size

#### Recorrido en arreglos
Se puede utilizar un controlador de flujo iterativo, tal como un for o un while. Una forma alterna de recorrido es utilizar un forEach, que se define con la misma palabra reservada _for_, sin embargo, la definción de recorrido es diferente.

----

### Correr y compilar

Para compilar en Kotlin

```
kotlinc -include-runtime Arrays.kt -d Arrays.jar
```

El comando anterior, crea un archivo ***.jar*** que puede correr con el comando siguiente

```
kotlin Arrays.jar
```

Otra opción para correr el programa es

```
java -jar Arrays.jar
```
