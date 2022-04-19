fun main() {
    imprimirNombre(nombre = "Bryan", apellido = "Palacios", segundoApellido = "Guido")
}

fun imprimirNombre(nombre: String,segundoNombre: String = "", apellido: String, segundoApellido: String){
    println("Mi nombre completo es: $nombre $segundoNombre $apellido $segundoApellido ")

}