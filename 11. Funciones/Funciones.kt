
fun suma(num1:Int, num2:Int):Int {
	return num1+num2
}

// Sobrecarga de funciones
fun suma(num1:Double, num2:Double):Double{
	return num1 + num2
}

// Sobrecarga de funciones
fun suma(num1:Int, num2:Int, num3:Int):Int {
	return num1+num2+num3
}

// Funciones como variables
var saluda = {nombre:String -> "Hola! Saludos " + nombre}

var concatena = {s1:String, s2:String -> "La concatenacion es : " + s1 + s2}

fun main()	{
	var n1:Int = 5
	var n2:Int = 10
	
	// Función suma
	var result:Int = suma(n1, n2)
	
	println(result)
	
	var d1:Double = 3.5
	var d2:Double = 4.2
	
	// Suma con double	
	var resultD:Double = suma(d1, d2)
	
	println(resultD)
	
	// Suma con tres parámetros
	println(suma(3, 52, 3))
	
	// Funciones definidas en variables
	println(saluda("Emmanuel"))
	
	println(concatena("Hola ", "mundo"))
}
