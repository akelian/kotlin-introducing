class Main

    fun main() {
        val tasks = Tasks()
        tasks.firstTask()
        tasks.fifthTask()
        readLine()?.toInt()?.let { tasks.seventhTask(it) }

    }