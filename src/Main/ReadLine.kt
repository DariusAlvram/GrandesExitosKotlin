package Main

import java.util.*

fun main(){
    println("Dame tu nombre:")
    val nombre = readln()
    println("Nombre: $nombre")

    println("Dame tu edad:")
    val edad = readln().toInt()
    println("Edad: $edad")

    println("Dame tu altura:")
    val altura = readln().toFloat()
    println("Edad: $altura")

// Alternativa usando Java Scanner
    val scanner = Scanner(System.`in`)

    // Leer string
    println("Introduce un texto:")
    val texto = scanner.nextLine()
    println("Texto ingresado $texto")

    // Leer un entero
    println("Introduce un numero entero:")
    val numeroEntero = scanner.nextInt()
    println("Numero entero ingresado $numeroEntero")

    // Leer un entero
    println("Introduce un numero flotante/decimal:")
    val numeroFlotante = scanner.nextFloat()
    println("Numero flotante ingresado $numeroFlotante")
}



