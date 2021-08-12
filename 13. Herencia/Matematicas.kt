open class Matematicas() {
	
	open fun suma(v1:Int, v2:Int): Int {
		return v1+v2
	}
	
	fun resta(v1:Int, v2:Int): Int {
		return v1-v2
	}
		
}

class Operador:Matematicas() {

	override fun suma(v1:Int, v2:Int): Int {
		return v1+v2+100
	}
	
	fun multiplicacion(v1:Int, v2:Int): Int {
		return v1*v2
	}
	
	fun division(v1:Double, v2:Double): Double {
		return v1/v2
	}
}

fun main(){
	var mate = Operador()
	
	println("Suma: " + mate.suma(4, 2))
	println("Resta: " + mate.resta(5, 2))
}
