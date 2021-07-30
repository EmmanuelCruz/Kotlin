# Operadores.
## Emmanuel Cruz Hernández

----

### Descripción
Uso de operadores básicos de un lenguaje de programación.

#### Operadores aritméticos
* Suma (+)
* Resta (-)
* División (/)
* Producto (*)

#### Operadores relacionales
* Mayor que (>)
* Mayor o igual que (>=)
* Menor que (<)
* Menor o igual que (<=)
* Igual que (==)
* Distinto de (!=)

#### Operaciones lógicas
* And (&&)
* Or (||)
* Not (!)

#### Operador de concatenación
* Concatenación (+)

----

### Correr y compilar

Para compilar en Kotlin

```
kotlinc -include-runtime operadores.kt -d operadores.jar
```

El comando anterior, crea un archivo ***.jar*** que puede correr con el comando siguiente

```
kotlin operadores.jar
```

Otra opción para correr el programa es

```
java -jar operadores.jar
```
