fun main(){
    val numerosDeLoteria = listOf(11,22,43,56,78,66)
    val numerosSorted = numerosDeLoteria.sorted()
    println(numerosSorted)

    val numerosDeLoteriaDescendientes = numerosDeLoteria.sortedDescending()
    println(numerosDeLoteriaDescendientes)

    val ordenarPorMultiplos = numerosDeLoteria.sortedBy { numero -> numero < 50 }
    println(ordenarPorMultiplos)

    val numerosAleatorios = numerosDeLoteria.shuffled()
    println(numerosAleatorios)

    val numerosEnReversa = numerosAleatorios.reversed()
    println(numerosEnReversa)

    val mensajeDeNumeros = numerosDeLoteria.map { numero -> "tu numero de loteria es $numero" }
    println(mensajeDeNumeros)

    val numeroFiltrados = numerosDeLoteria.filter { numero -> numero > 50 }
    println(numeroFiltrados)

    

}