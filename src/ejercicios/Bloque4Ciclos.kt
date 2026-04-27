package ejercicios

fun ejecutarBloque4() {

    // 16. Conteo Simple
    for (i in 1..10) {
        println("Número: $i")
    }

    // 17. Cuenta Regresiva
    for (i in 10 downTo 1) {
        println("Cuenta regresiva: $i")
    }

    // 18. Saltos de 3
    for (i in 1..20 step 3) {
        println("Salto de 3: $i")
    }

    // 19. While (energía)
    var energia = 5

    while (energia > 0) {
        println("Energía restante: $energia")
        energia-- // resta 1
    }

    // 20. Do-While (contraseña)
    var contraseña = ""

    do {
        println("Ingrese la contraseña:")
        contraseña = "1234" // simulación (como si el usuario la ingresara)
    } while (contraseña != "1234")

    println("Acceso concedido")
}