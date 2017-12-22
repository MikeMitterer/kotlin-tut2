package kdemo

import at.mikemitterer.kotlin.c4.showMyName
import org.apache.commons.lang3.time.StopWatch as swx

class KotlinGreetingJoiner(val greeter: demo.Greeter) {

    val names = java.util.ArrayList<String?>()

    fun addName(name: String?) {
        //val kn = KName()

        val sw = swx()
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
