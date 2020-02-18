open class Man(override var name: String, override var age: Int, override var gender: Gender) : Human {
    constructor() : this()

    var occupation: String? = null

    override fun say() {
        println("my name is $name, i'am $age y.o.")
    }

    override fun eat() {
        println("$name делает жрать")
    }

    override fun work() {
        println("nadoelo work")
    }
}