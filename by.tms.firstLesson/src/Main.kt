import HW2.*
import java.util.*
import kotlin.collections.ArrayList

class Main

fun main() {

        val batya = Father(true, "Active search", "Oleg", 43, Gender.Man )
        batya.say()
        val spinogriz = Son(false,"Had work", "Oleg2", 18)
        spinogriz.say()
        val maman = Mother("Elena", 44, Gender.Woman, 2, "Lonely")
        maman.say()
        val dunya = Daughter("Katya", 19, Gender.Woman,0 , "not married")
        dunya.say()

        val list : ArrayList<Human> = ArrayList()
        list.add(batya)
        list.add(spinogriz)
        list.add(maman)
        list.add(dunya)
}
