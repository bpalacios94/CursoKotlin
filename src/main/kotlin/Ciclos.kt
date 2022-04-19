fun main(){

    val listaDeFrutas = listOf("Manzana", "Pera","Frambuesa", "Durazno")

    for (fruta in listaDeFrutas) println("hoy voy a comerme una fruta llamada: $fruta " )
    println("\n")
    listaDeFrutas.forEach { fruta -> println("hoy voy a comerme una fruta nueva llamada: $fruta") }
    println("\n")
    val caracteresDeFrutas: List<Int> = listaDeFrutas.map { fruta -> fruta.length }
    println(caracteresDeFrutas)

    val listaFiltrada = caracteresDeFrutas.filter { largoDeFruta -> largoDeFruta>5 }
    println(listaFiltrada)

}