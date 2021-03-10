fun main(){
    val name: String = "Jakub"
    println(name)

    var prop1: Int? = 27
    if (prop1 == null){
        println("NULL")
    }
    else{
        println("NOT NULL")
    }

    when(prop1){
        25 -> println("Hi")
        26 -> println("There")
        else -> println("ERROR")
    }

    prop1 = null
    var prop2: Int = if(prop1 != null) prop1 else 100

    println(prop2)
}