package Main

fun main(){
    val colores = listOf("rojo", "verde", "azul", 123)

    println(colores)

    println(colores.joinToString("-"))

    for(color in colores){
        println("color: $color")
    }

    println("Color en la casilla 0 es el ${colores[0]}")

//    colores[0] = "violeta"     // Esta no se puede modificar ya que no es mutable
}