package ejercicios

fun ejecutarBloque5() {

    // 21. Saludo Personalizado
    val saludo = saludar("Tatiana")
    println(saludo)

    // 22. Suma Exprés
    val suma = sumar(5, 3)
    println("Suma: $suma")

    // 23 y 24. Parámetro por defecto + argumento nombrado
    val area = crearRectangulo(ancho = 5)
    println("Área del rectángulo: $area")

    // 25. Conversor
    val pesos = convertirADineroLocal(10.0)
    println("10 dólares en pesos: $pesos")
}


// 21. Función con retorno
fun saludar(nombre: String): String {
    return "Hola, $nombre"
}


// 22. Función de una sola línea
fun sumar(a: Int, b: Int): Int = a + b


// 23. Parámetro por defecto
fun crearRectangulo(ancho: Int, alto: Int = 10): Int {
    return ancho * alto
}


// 25. Conversor (USD a COP aprox)
fun convertirADineroLocal(dolares: Double): Double {
    val tasa = 4000.0 // puedes cambiarla
    return dolares * tasa
}