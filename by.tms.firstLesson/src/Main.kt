import HW2.*

class Main

fun main() {

        val batya = Father(true, "Active searching","Oleg", 43)
        batya.say()
        val spinogriz = Son(false,"Had work", "Oleg2", 18)
        spinogriz.say()
        val maman = Mother("Elena", 44, Gender.Woman, 2, "Lonely")
        maman.say()
        val dunya = Daughter("Katya", 19, Gender.Woman,0 , "not married")
        dunya.say()
}
