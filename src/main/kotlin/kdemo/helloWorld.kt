package kdemo

import org.apache.commons.lang3.time.StopWatch

fun showMyName(name: String) {
    println(name)
}

class KotlinGreetingJoiner(val greeter: demo.Greeter) {

    val names = java.util.ArrayList<String?>()

    fun addName(name: String?) {
        //val kn = KName()

        val sw = StopWatch()
        sw.start()

        showMyName("Mike")
        names.add(name)
        Thread.sleep(500)
        sw.stop()
        println("Took $sw \n")
    }


    fun getJoinedGreeting(): String {
        return "${greeter.greeting} ${names.filterNotNull()
                .joinToString(separator = " and ")}"
    }
}
