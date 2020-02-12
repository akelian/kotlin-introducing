class Main

fun main() {
    val student = Human.Student()
    val teacher = Human().Teacher()

    println(student.sayId())
    println(teacher.sayHello())
    println(teacher.giveHomeWork())
}
