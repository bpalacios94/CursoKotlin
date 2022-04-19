fun main(){
    val nombre = ""

    if (nombre.isNotEmpty()) println("El largo de nuestra variable nombre es: ${nombre.length}") else println("Error, la variable esta vacia")

    val mensaje : String = if (nombre.length > 4){
        "Tu nombre es largo"
    }else if(nombre.isEmpty()){
        "el nombre esta vacio!"
    }else{
        "tu nombre es corto"
    }

    println(mensaje)


}