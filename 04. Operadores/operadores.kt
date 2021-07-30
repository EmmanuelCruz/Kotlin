fun main(){
	
	///////// OPERADORES ARITMÉTICOS /////////
	
	print("Ingresa un numero: ")
	var num1:Int = readLine()?.toInt()?:0
	
	print("Ingresa un segundo numero: ")
	var num2:Int = readLine()?.toInt()?:0
	
	// Suma de los numeros ingresados
	var result:Int = num1+num2
	println("La suma es : " + result)
	
	// Resta de los numeros ingresados
	result = num1-num2
	println("La resta es: " + result)
	
	// División de los numeros ingresados
	result = num1/num2
	println("La división es: " + result)
	
	// Multiplicación de los números ingresados
	result = num1 * num2
	println("LA multiplicación es: " + result)
	
	// Operador de incremento
	var incrementado:Int = 5
	// Funciona exactamente como en Java con operadores postfijos y prefijos
	println("El valor incrementado es: " + ++incrementado)
	
	// Operador de decremento
	var decrementado:Int = 10
	println("El valor decrementado es " + --decrementado)
	
	println(decrementado--+incrementado+++incrementado)
	
	
	///////// OPERADORES RELACIONALES /////////
	
	println("El valor " + num1 + " es mayor que " + num2 + ": " + (num1>num2))
	println("El valor " + num1 + " es mayor o igual que " + num2 + ": " + (num1>=num2))
	println("El valor " + num1 + " es menor que " + num2 + ": " + (num1<num2))
	println("El valor " + num1 + " es menor o igual que " + num2 + ": " + (num1<=num2))
	println("El valor " + num1 + " es igual que " + num2 + ": " + (num1==num2))
	println("El valor " + num1 + " es distinto que " + num2 + ": " + (num1!=num2))
	
	///////// OPERADORES LÓGICOS /////////
	var bool1:Boolean = true
	var bool2:Boolean = false
	
	println(bool1.toString() + " AND " + bool2.toString() + ": " + (bool1&&bool2))
	println(bool1.toString() + " OR " + bool2.toString() + ": " + (bool1||bool2))
	println("NOT " + bool1 + ": " + (!bool1))
	println("NOT " + bool2 + ": " + (!bool2))
	
}
