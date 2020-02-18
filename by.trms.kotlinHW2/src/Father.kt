open class Father(name: String, age: Int) : Man(name, age, Gender.Man) {
    protected var hasFamily: Boolean? = null

    constructor(hasFamily: Boolean, name : String, age : Int)
            : this(name, age){
        this.hasFamily = hasFamily
    }

    constructor(hasFamily: Boolean, occupation :String, name : String, age : Int)
            : this(name, age){
        this.hasFamily = hasFamily
        super.occupation = occupation
    }

    override fun say() {
        print("${if(hasFamily == true){"Happy "}else{"Lonely "}} father telling tale. " +
                "His bio: name: $name; $age y.o.; $gender; ocup: $occupation")
    }
}