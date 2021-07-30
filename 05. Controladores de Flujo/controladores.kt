fun main(){
	
	print("Ingresa un valor: ")
	var value:Int = readLine()!!.toInt()
	
	when(value){
		18, 19 -> {
			println("Se eligió el 18 ")
			println("o 19")
		}
		20, 21 -> {
			println("Se eligió el 20 ")
			println("o el 21")
		}
		34, 35, 36 -> {
			println("Se eligió el 34 ")
			println("o el 35 ")
			println("o el 36")
		}
		10 -> println("Se eligió el 10")
		else -> println("Caso no definido")
	}
	
	
	
}
