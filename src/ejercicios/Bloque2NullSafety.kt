package ejercicios

fun ejecutarBloque2() {

    // 6. El Opcional
    var apodo: String? = null

    // 7. Operador Elvis
    val resultadoApodo = apodo ?: "Sin apodo"
    println("Apodo: $resultadoApodo")

    // 8. Llamada Segura
    val longitudApodo = apodo?.length
    println("Longitud del apodo: $longitudApodo")

    // 9. Uso de let
    var correo: String? = "tatianavanegas2006@gmail.com"

    correo?.let {
        println("Correo enviado a $it")
    }

    // 10. Aserción No Nula
    var nombre: String? = "Tatiana"

    val longitudNombre = nombre!!.length
    println("Longitud del nombre: $longitudNombre")
}

