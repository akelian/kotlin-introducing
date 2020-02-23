package HW2

class Son(hasFamily: Boolean, occupation: String, name: String, age: Int, gender: Gender) : Father(hasFamily, occupation, name, age, Gender.Man) {

    override fun say() {
        println("My name is $name, $age y.o., with no $occupation." +
                " Also ${if (hasFamily == true) {"i have a family"}else{"i am orphan"}}")

    }
}