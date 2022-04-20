fun main() {
    // Let y safe calls
    var nombre : String? = null

    nombre?.let {
            valor -> println("El valor no es nulo, es $valor")
    }


    nombre = "Bryan"
    nombre?.let {
            valor -> println("El valor no es nulo, es $valor")
    }

}