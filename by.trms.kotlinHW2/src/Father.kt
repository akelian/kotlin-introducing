class Father(name: String, age: Int, gender: Gender) : Man(name, age, gender) {
    protected var hasFamily: Boolean? = null

    constructor(hasFamily: Boolean) : super()
}