package Main

fun main() {
    print("Dame tu edad: ")
    val edad = readln().toInt()

    if (edad >= 18) {
        println("puedes entrar al bar")
    } else if(edad in 14..17) {
        println("Puedes entrar al aread de adolescentes")
    } else if(edad in 10..14){
        println("Puedes entrar al area infantil")
    } else {
        println("No puedes entrar al bar")
    }
}