fun main(){
	
	var numeros = Array<Int>(5){1}
	
	// Los indices van de 0 a la longitud-1
	numeros[0] = 23
	numeros[1] = 34
	numeros[2] = 45
	numeros[3] = 67
	numeros[4] = 444
	
	// Recorrido de un arreglo
	
	// For
	for(iter in 0 until numeros.size){
		println(numeros[iter])
	}
	
	// For each
	for(value in numeros){
		println(value)
	}
}
