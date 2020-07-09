package Model

fun main(args: Array<String>){
    val s1 = Student(1,"Phuong",20)

    println(s1.component1())
    println("name 1 = ${s1.name}")
    println("age = ${s1.age}")

    var s1copy = s1.copy()

}