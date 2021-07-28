# Captura de Datos.
##Emmanuel Cruz Hernández

----

### Descripción
Para leer datos desde consola se utiliza la función ***readLine()*** que regresa una línea leída desde consola. Si se quiere ingresar un dato de tipo numérico como un entero, se debe hacer una conversión de tipo con un chequeo tomando en cuenta los dos siguientes casos.

* Si la entrada es un dato numérico hace la conversión.
* Si la entrada no es un dato numérico se da uno por default.

Para hacer un chequeo se utiliza la siguiente sintaxis.

		var entradaEntero = readLine()?.toInt()

Nótese el uso del operador **?** para hacer verificaciones.

----

### Correr y compilar

Para compilar en Kotlin

```
kotlinc -include-runtime CapturaDatos.kt -d CapturaDatos.jar
```

El comando anterior, crea un archivo ***.jar*** que puede correr con el comando siguiente

```
kotlin CapturaDatos.jar
```

Otra opción para correr el programa es

```
java -jar CapturaDatos.jar
```
