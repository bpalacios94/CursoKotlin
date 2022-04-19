fun main() {
    val largoDelValorInicial = superFunction("Hola!", block = { valor ->
    valor.length
    })

    println(largoDelValorInicial)

    val lambda: () -> String = functionInception("Enrique")
    val valorLambda: String = lambda()
    println(valorLambda)

}

fun superFunction(valorInicial : String, block : (String) -> Int) : Int {

    return block(valorInicial)
}

fun functionInception(nombre : String) : () -> String{
    return {
        "hola desde la lambda $nombre"
    }
}