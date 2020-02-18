open class Woman(override var name: String, override var age: Int, override var gender: Gender) : Human {
    var bio: String? = null
    override fun say() {
        println("my name is $name, i'am $age y.o.")
    }

    override fun eat() {
        println("$name nom nom nom")
    }

    override fun work() {
        println("8 hours of hard work is done")
    }
}