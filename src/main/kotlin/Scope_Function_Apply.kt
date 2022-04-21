/*
fun main() {
    val newShoe = Shoe()

    val shoeDetail = newShoe.apply {
        size = 42
        color = "Rojo"
        stock = 25
    }.toString()

    print(shoeDetail)
}

data class Shoe(
    var size: Int = 38, var color: String = "Negro", var stock: Int = 10
)
*/


fun main() {
    val moviles = mutableListOf("Google Pixel 2XL","Google Pixel 4a","Xiaomi Redmi 9","Huawei Y3").apply {
        removeIf { movil -> movil.contains("Google") }
    }

    println(moviles)

    val colores : MutableList<String> = mutableListOf("Amarillo","Azul","Rojo")
   colores.apply {
       println("Nuestros colores son: $this")
       println("La cantidad de colores es: $size")

   }

}