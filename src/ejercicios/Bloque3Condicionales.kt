package ejercicios

fun ejecutarBloque3() {

    // 11. Mayoría de Edad
    val edad = 20

    if (edad >= 18) {
        println("Puede votar")
    } else {
        println("No puede votar")
    }

    // 12. If como expresión
    val nota = 3.5
    val resultado = if (nota >= 3.0) "Aprobado" else "Reprobado"

    println("Resultado: $resultado")

    // 13. Semáforo
    val color = "Rojo"

    when (color) {
        "Rojo" -> println("Pare")
        "Amarillo" -> println("Precaución")
        "Verde" -> println("Siga")
        else -> println("Color no válido")
    }

    // 14. Rangos en when
    val temperatura = 20

    when (temperatura) {
        in Int.MIN_VALUE..14 -> println("Frío")
        in 15..25 -> println("Templado")
        else -> println("Calor")
    }

    // 15. Verificación de tipo
    val dato: Any = "Hola"

    when (dato) {
        is String -> println("Es un String con longitud ${dato.length}")
        is Int -> println("Es un Int con valor $dato")
        else -> println("Tipo desconocido")
    }
}