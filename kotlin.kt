fun AddNumbers(a: Int, b: Int) :Int{
    return a + b
}

fun PrintName(name: String?){
    if(name == null){
        println("NULL ERROR")
        return
    }

    println("Hello $name")
    return
}

fun GetString() = "String abc"



fun main(){
    println(AddNumbers(10,20))
    PrintName("Jakub")
    PrintName(null);
    println(GetString())
}