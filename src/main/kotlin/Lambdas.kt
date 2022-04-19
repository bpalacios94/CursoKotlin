fun main() {
    val myLambda : (String) -> Int ={ valor -> valor.length }
    val lambdaEjecutada: Int = myLambda("hola platzi")
    println(lambdaEjecutada)

    val saludos = listOf("Hello","Hola","Ciao")
    val longitudDeSaludos = saludos.map(myLambda)

    println(longitudDeSaludos)
}