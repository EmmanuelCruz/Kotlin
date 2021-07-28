fun main(){
	
	// Ejemplos de tipos de datos en Kotlin.
	
	var entero:Int = 43
	println("Entero: " + entero)
	
	var cadena:String = "Hola mundo"
	println("Cadena: " + cadena)
	
	var doble:Double = 3.4
	println("Doble: " + doble)
	
	var flotante:Float = 34.87F
	println("Flotante: " + flotante)
	
	var caracter:Char = 'C'
	println("Caracter: " + caracter)
	
	var booleanoV:Boolean = true
	println("Boolean en true: " + booleanoV)
	var booleanoF:Boolean = false
	println("Boolean en false: " + booleanoF)
	
	// Conversión de tipos
	var a:String = "34"
	var b:Int = a.toInt()
	var c:Float = a.toFloat()
	var d:String = b.toString()
	
	// Variable con valor nulo
	var nulo:Int? = null
}
