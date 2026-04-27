package ejercicios

fun ejecutarBloque6() {

    // 26. Lista de Compras
    val compras = mutableListOf("Leche", "Pan", "Huevos")

    compras.add("Queso") // añadir
    compras.removeAt(1) // eliminar el segundo (índice 1)

    println("Lista de compras: $compras")

    // 27. Filtro de Precios
    val precios = listOf(20, 55, 40, 100, 35)

    val baratos = precios.filter { it < 50 }
    println("Precios menores a 50: $baratos")

    // 28. Buscador
    val amigos = listOf("Carlos", "Ana", "Luis", "Andrés")

    val encontrado = amigos.find { it.startsWith("A") }
    println("Amigo encontrado: $encontrado")

    // 29. Extensión de Int
    val numero = -5
    println("¿Es negativo? ${numero.esNegativo()}")

    // 30. Extensión de String
    val texto = "Hola mundo "
    println("Texto sin espacios: ${texto.quitarEspacios()}")
}


// 29. Extensión para Int
fun Int.esNegativo(): Boolean {
    return this < 0
}


// 30. Extensión para String
fun String.quitarEspacios(): String {
    return this.replace(" ", "")
}