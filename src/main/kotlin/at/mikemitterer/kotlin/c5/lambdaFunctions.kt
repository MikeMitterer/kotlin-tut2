package at.mikemitterer.kotlin.c5

import java.util.*




fun printLambda1Param(callback: (value: String) -> Unit) {
    callback("Mike")
}

fun printLambda2Param(callback: (value: String, value2: String) -> Unit) {
    callback("Mike","Mitterer")
}




fun requireTest(age:Int) : Int {
    require(age > 33, { "Age must be above 33" })
    return age
}

fun namedParams(name:String,age: Int) : String = "Name: $name, Age: $age"

fun String.say(word:String) : String {
    return "${this} - say: $word"
}

open class ExtendClassWithScope(val petName: String) {

    private fun String.shout(word:String): String {
        return "$this: (shout) $petName - $word"
    }

    fun shout() = "Mike".shout("no clue")
}

class ExtendTheExtions : ExtendClassWithScope("Rolf") {

}

fun Int.Companion.random() : Int {
    val random = Random()
    return random.nextInt(1)
}

fun myAssert(name: String? = null,callback: () -> String) : String {
    return when (name) {
        null -> callback()
        else -> "$name -> ${callback()}"
    }
}

fun miniDSL(callback: () -> String) : String = callback()


fun multiReturnValues() : Pair<String,Int> = Pair("Mike",51)

fun functionWithTwoParams(name: String, callback: (name: String, age: Int) -> String ) : String {
    return callback(name, 51)
}

class NameFunctor {

    // operator muss definiert werden
    operator fun invoke(name: String) : String {
        return "Name: $name"
    }
}
