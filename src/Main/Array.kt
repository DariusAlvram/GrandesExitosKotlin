package Main

fun main(){
    val cosasMixtas = arrayOf("manzana", 42, "Kotlin", 3.14, true)
    println("Elementos en la lista mixta: ")
    for(elemento in cosasMixtas){
        println(elemento)
    }

    cosasMixtas[4] = "gatito"
    println(cosasMixtas.joinToString("-"))

    val numeros = intArrayOf(10, 20, 30, 40, 50)
    println("Elementos en la lista numerica: ")
    for(numero in numeros){
        println(numero)
    }

    val flotantes = floatArrayOf(1.1f, 2.2f, 3.3f, 4.4f, 5.5f)
    println("Elementos en la lista de flotantes")
    for(flotante in flotantes){
        println(flotante)
    }

}