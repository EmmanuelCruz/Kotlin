fun main(){
	println("EJEMPLO DE RANGO EN IF")
	var verificado = readLine()!!.toInt()
	
	if(verificado in 4..9){
		println("Si está contenido en el rango")
	} else{
		println("No está contenido en el rango")
	}
	
	println("\nEJEMPLO DEL USO DE DOWNTO")
	
	for(iter in 7 downTo 2){
		println(iter)
	}
	
	println("\nEJEMPLO DEL USO DE STEP")
	for(paso in 2..20 step 2){
		println(paso)
	}
	
	println("\nEJEMPLO DEL USO DE UNTIL")
	for(excluido in 2 until 6){
		println(excluido)	
	}
	
	println("\nEJEMPLO DE COMBINACIÓN DE DOWNTO CON STEP")
	for(recorrido in 15 downTo 0 step 3){
		println(recorrido)
	}
	
	println("\nEJEMPLO DE COMBINACIÓN DE UNTIL CON STEP")
	for(untilStep in 20 until 30 step 2){
		println(untilStep)
	}
	
}
