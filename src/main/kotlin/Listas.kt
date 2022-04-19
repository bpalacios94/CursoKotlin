fun main(){
    val listaDeNombres = listOf("Juan","Enrique","camila")
    println(listaDeNombres)

   val listaVacia = mutableListOf<String>()
    println(listaVacia)
    listaVacia.add("Juan Diego")
    println(listaVacia)

    val valorUsandoGet = listaVacia.get(0)
    println(valorUsandoGet)

    val valorUsandoOperador = listaVacia [0]
    println(valorUsandoOperador)

    val primerValor: String? = listaDeNombres.firstOrNull()
    println(primerValor)


    listaVacia.removeAt(0)
    println(listaVacia)

    listaVacia.add("Enrique")
    println(listaVacia)
    listaVacia.removeIf { caracteres -> caracteres.length > 3 }
    println(listaVacia)

    val  myArray = arrayOf(1,2,3,4)
    println("muestro mi array ${myArray.toList()}")


}