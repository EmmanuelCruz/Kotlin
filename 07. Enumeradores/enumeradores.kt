enum class Meses(var nombre:String){
	ENE("Enero"), FEB("Febrero"), MAR("Marzo"), ABR("Abrirl"), MAY("Mayo"), JUN("Junio"), 
	JUL("Julio"), AGO("Agosto"), SEP("Septiembre"), OCT("Octubre"), NOV("Noviembre"), DIC("Diciembre")
}

fun main(){
	println("El mes enero: " + Meses.ENE)
	println("El mes febrero: " + Meses.ENE.nombre)
}
