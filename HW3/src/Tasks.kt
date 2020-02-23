import kotlin.time.times

class Tasks {
    fun firstTask (){
        var a : Int? = readLine()?.toInt()
        var b : Int? = readLine()?.toInt()
            if (a?.rem(2) == 0) { println(a?.times(b?:1))}
            else  println(a?.plus(b!!))
    }

//    fun secondTask
}