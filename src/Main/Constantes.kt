package Main

const val nombre3 = "Perrito" // Const para declaración global

fun dameNombre(): String{
    return "Dario"
}

fun main(){
    val nombre1 = "Luis"       // Val para constantes locales
    val nombre2 = dameNombre()
//    nombre3 = dameNombre()   // Const no se puede reasignar
//    nombre3 = "Gatito"       // Const no se puede reasignar

    println("Nombre1 : $nombre1")
    println("Nombre2 : $nombre2")
    println("Nombre3 : $nombre3")
}