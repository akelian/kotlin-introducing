package HW2

open class Man(override var name: String, override var age: Int, override var gender: Gender) : Human {

    var occupation: String? = null

    override fun say() {
        println("my name is $name, i'am $age y.o.")
    }

    override fun eat() {
        println("$name zhret")
    }

    override fun work() {
        println("nadoelo work")
    }
}