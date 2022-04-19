import java.lang.Exception

fun main(){

    var nombre : String? = null

    try {
        throw NullPointerException("ha ocurrido un error de nullpointer")
    }catch (exception : NullPointerException){
        println("ha ocurrido un error")
    }finally {
        println("aqui paso por el Finally")
    }

    val primerValor = 10
    val segundoValor = 0
    val resultado = try{ primerValor / segundoValor } catch (e : Exception) {0}
    println(resultado)

}