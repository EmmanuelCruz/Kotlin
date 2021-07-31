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
	
	// FOR
	
	for(num in 0..10){
		println(num)
	}
	
	// While
	
	var contador:Int = 1
	
	while(contador <= 10){
		println(contador)
		contador++
	}
	
	// Do While
	
	var contadorDo:Int = 1
	
	do{
		println(contadorDo)
		contadorDo++
	} while(contadorDo <= 10)
	
}
