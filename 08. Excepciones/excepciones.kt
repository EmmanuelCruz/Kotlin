fun main(){
	
	try{
		var entrada = readLine()!!.toInt()
	} catch(e: Exception){
		println("El tipo no es un entero.")
	} finally {
		println("Término de programa")
	}
	
}
