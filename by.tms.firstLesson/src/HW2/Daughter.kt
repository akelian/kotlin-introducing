package HW2

class Daughter(name: String, age: Int, gender: Gender, numOfChilds: Int, married: String) : Mother(name, age, Gender.Woman, numOfChilds, married) {
    override fun say() {
        println("My name is $name, $age y.o.,currently $isMarried with $numOfChilds childs. Probably $gender")
    }
}