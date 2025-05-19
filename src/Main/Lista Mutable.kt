package Main

fun main(){
    val mascotas = mutableListOf<String>("gatito", "perrito")
    println(mascotas.joinToString("-"))

    // Cambiar elemento de la lista
    mascotas[1] = "conejito"
    println(mascotas.joinToString("/"))

    // Agregar elemento al final de la lista
    mascotas.add("caballito")
    println(mascotas.joinToString("-"))

    // Agregar nuevamente el perrito al inicio
    mascotas.add(0, "perrito")
    println(mascotas.joinToString())

    // Eliminar elemento de lista
    mascotas.removeLast()
    println(mascotas.joinToString(",        "))

//    mascotas = mutableListOf()   // No posible reasignar una nueva lista completa
//    Esto se debe a que nuestra lista es constante "val" esta es una buena practica
//    Se busca evitar errores logicos por cambios a futuro
}