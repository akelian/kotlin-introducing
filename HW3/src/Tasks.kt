import kotlin.time.times

class Tasks {
    fun firstTask (){
        val a : Int? = readLine()?.toInt()
        val b : Int? = readLine()?.toInt()
            if (a?.rem(2) == 0) { println(b?.let { a.times(it) })}
            else  println(b?.let { a?.plus(it) })
    }

    fun secondTask (){

    }

    fun thirdTask(){
        when (readLine()?.toInt()){
            in 0..19 -> println("F")
            in 20..39 -> println("E")
            in 40..59 -> println("D")
            in 60..74 -> println("C")
            in 75..89 -> println("B")
            in 90..100 -> println("A")
            else -> print("input error")
        }
    }

    fun fourthTask(){
        println("Enter first convert parameters")
        val a : Int? = readLine()?.toInt()
        val b : Int? = readLine()?.toInt()
        println("Enter second convert parameters")
        val c : Int? = readLine()?.toInt()
        val d : Int? = readLine()?.toInt()

        if(a !== null && b !== null && c !== null && d !== null) {
            if ((a < c && b < d )|| (a < d && b < c)) {
                println("First convert can be boxed into second")
            } else if ((a > c && b > d )|| (a > d && b > c)){
                println("Second convert can be boxed into first")
            } else  println("no way")
        }
    }

    fun fifthTask(){
        var counter = 0
        var sumOfNums = 0
        for(i in 1..99){
            if(i.rem(2) == 0) {
                sumOfNums += i
                counter++
            }
        }
        println("$counter even numbers was counted, it sum is $sumOfNums")
    }
    
    fun sixthTask(){
        var num : Int? = readLine()?.toInt()
        num?.let{for(i in 1..it){
                num *= i
            }
        }
        println("result $num")
    }

    fun seventhTask(num : Int) = with(Integer.toBinaryString(num)){
        println(toString())
    }


}