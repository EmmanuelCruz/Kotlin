fun main(){
	
	var datos:ArrayList<String> = ArrayList<String>()
	
	// Agregar datos
	datos.add("Hola")
	datos.add("mundo")
	datos.add("in")
	datos.add("Kotlin")
	
	// Obtener elementos
	datos.get(0)
	
	// Eliminar por dato
	datos.remove("Kotlin")
	
	// Eliminar por índice
	datos.removeAt(2)
	
	// Modificar valores
	datos.set(0, "Adios")
	
	// Recorrer una lista
	for(dato in datos){
		println(dato)
	}
	
	// Limpiar la lista
	datos.clear()
}
