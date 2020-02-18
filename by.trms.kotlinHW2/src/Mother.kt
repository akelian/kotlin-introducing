open class Mother(name: String, age: Int, gender: Gender) : Woman(name, age, Gender.Woman) {
    protected var numOfChilds: Int ?= null

    constructor(name : String, age : Int, gender: Gender, numOfChilds : Int) :
            this(name, age, Gender.Woman){
        this.numOfChilds = numOfChilds
    }
    constructor(name : String, age : Int, gender: Gender, numOfChilds : Int, married : String) :
            this(name, age, Gender.Woman){
        this.numOfChilds = numOfChilds
        super.isMarried = married
    }

    override fun say() {
        println("$name - mother of $numOfChilds, $age y.o. and currently $isMarried")
    }
}