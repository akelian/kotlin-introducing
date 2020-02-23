class HumanFS {
    var name: String? = null

    class Student {
        var studentId: Int? = null
        //        var studCount: Int? = 123
        fun sayId() = "my id is ${studentId /*?: 123*/ /*studCount*/}"
    }

    inner class Teacher {
        val hwConst = 14

        init {
            name = "Alex"
        }

        var homeworkId: Int? = null

        fun sayHello() = "my name is ${name ?: "OLEG" /*studCount*/}"
        fun giveHomeWork(): String {
            if (homeworkId == null) {
                return "Homework id is $hwConst"
            }; return "Homework id is ${homeworkId ?: 0}"
        }

    }

}