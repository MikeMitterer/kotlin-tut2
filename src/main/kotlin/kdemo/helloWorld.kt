package kdemo

fun showMyName(name: String) {
    //println(name)
    System.out.println(name + "aa")
}

class KotlinGreetingJoiner(val greeter: demo.Greeter) {

    val names = java.util.ArrayList<String?>()

    fun addName(name: String?) {
        val kn = KName()

        showMyName("Mike")
        names.add(name)
    }


    fun getJoinedGreeting(): String {
        return "${greeter.greeting} ${names.filterNotNull()
                .joinToString(separator = " and ")}"
    }
}
