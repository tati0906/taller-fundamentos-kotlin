package ejercicios

fun ejecutarBloque1() {

    val nombre = "Tatiana"
    var ciudad = "Bogotá"

    println("Nombre: $nombre")
    println("Ciudad: $ciudad")

    ciudad = "Medellín"
    println("Nueva ciudad: $ciudad")

    val anioNacimiento = 2006
    val anioActual = 2026
    val edad = anioActual - anioNacimiento

    println("Edad aproximada: $edad")

    val precioCoche: Double = 200.000
    val pesoNaranja: Float = 0.25f
    val poblacionMundial: Long = 8_000_000_000

    println("Precio coche: $precioCoche")
    println("Peso naranja: $pesoNaranja")
    println("Población mundial: $poblacionMundial")

    val estaLloviendo = true
    println("¿Está lloviendo?: $estaLloviendo")

    println("Velocidad de la luz: ${Constants.VELOCIDAD_LUZ} m/s")
}

object Constants {
    const val VELOCIDAD_LUZ = 299_792_458
}