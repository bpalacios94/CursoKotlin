fun main() {
    val moviles = mutableListOf("Google Pixel 2XL","Google Pixel 4a","Xiaomi Redmi 9","Huawei Y3")
        .run {
            removeIf { movil -> movil.contains("Google") }
            this
        }

    println(moviles)
}