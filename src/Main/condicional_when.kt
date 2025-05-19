package Main

fun main(){
    val calificacion = 100

    when (calificacion){
        100 -> println("Excelente")
        in 90 ..99 -> {
            println("Muy bien")
            println("Casi perfecto")
        }
        in 80..90 -> {
            println("Bien")
        }
        in 70..80 -> {
            println("promedio")
        }
        else -> println("Reprobado :(")
    }

    // Evaluacion de dato
    val dato: Any = 1
    val resultado = when (dato) {
        is String -> "Es un texto"
        in 1..100 -> "Numero dentro de 1 - 100"
        is Int -> "Es un numero entero"
        else -> "Es otro tipo de dato"
    }
    println("Resultado: $resultado")

    // Evaluacion de un grupo
    val color = "rojo"

    when(color){
        "rojo", "verde", "blanco" -> {
            println("La bandera de Mexico contiene este color")
            println("Viva Mexico")
        }
        "amarillo", "naranja" ->{
            println("Estos son colores calidos")
        }
        "azul" -> println("Me encanta el azul")
    }
}