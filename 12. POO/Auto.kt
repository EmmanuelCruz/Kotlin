class Auto(marca:String, color:String) {

	// Marca del auto
	var marca:String? = null
	var color:String? = null
	
	// Función constructura. Se ejecuta al crear un nuevo objeto
	init {
		this.marca = marca
		this.color = color
		println("La marca del auto es: $marca")
		println("El color del auto es: $color")
	}
	
	fun GetMarca():String?{
		return this.marca
	}
	
	fun GetColor(): String? {
		return this.color
	}
}

class Camion() {

	// Marca del coche
	var marca:String? = null
	var color:String? = null

	constructor (marca:String, color:String):this(){
		this.marca = marca
		this.color = color
	}
	
	fun GetMarca():String? {
		return this.marca
	}
	
	fun GetColor():String? {
		return this.color
	}
}	

fun main() {
	var auto1 = Auto("Nissan", "Blanco")
	
	var camion = Camion("Toyota", "Gris")
	println("La marca del camión es " + camion.GetMarca() + " de color " + camion.GetColor())	
}
