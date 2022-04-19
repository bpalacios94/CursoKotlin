fun main() {

    val fraseAleatoria = "En PLATZI nunca dejamos de aprender".randomCase()

    imprimirFrase(fraseAleatoria)

}


fun String.randomCase() : String{
    val numeroAleatorio = 0..99
    val resultadoAleatorio = numeroAleatorio.random()
    return if (resultadoAleatorio.rem(2)==0){
         this.toUpperCase()

    }else{

        this.toLowerCase()

    }


}

fun imprimirFrase(frase: String) : Unit {
    println("Tu frase es : $frase")

}