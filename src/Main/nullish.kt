package Main

fun main(){
//    var nombre:String? = null
    var nombre:String? = "Dario"
    println("El nombre es $nombre y tiene ${nombre?.length} caracteres")

    // Ejecutar codigo si no es null
    nombre?.let{ valor:String ->
        println("El nombre es $valor y tiene ${valor?.length} caracteres")
    } ?: println("El nombre es nulo")

    // Alternativa usando lambda (Funcion anonima) se puede usar el parametro/variable auxiliar it
    nombre?.let{
        println("El nombre es $it y tiene ${it?.length} caracteres")
    } ?: println("El nombre es nulo")
}