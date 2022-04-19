fun main (){
    var nombre: String? = null
    val caracteresDeNombre : Int = nombre?.length ?: 0
    // El operador elvis (porque se el parece el copete haha) lo que hace es si el valor es null pone lo que esta a la derecha del operador
    println(caracteresDeNombre)

}