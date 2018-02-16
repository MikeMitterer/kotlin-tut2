package at.mikemitterer.kotlin.c4

import at.mikemitterer.kotlin.c5.printLambda1Param
import at.mikemitterer.kotlin.c5.printLambda2Param

@JvmOverloads
fun showMyName(name:String, age:Int = 50) : String {
    val result = "Name $name, Alter: $age..."

    println(result)
    return result
}

fun nestedFunction(name:String) : String {
    var result = name
    fun addAge() {
        result = name + "51"
    }

    addAge()
    return result
}

fun printUntilStop() {
    val list = listOf("a", "b", "stop", "c")
    // Crashed
//    stop@ list.forEach ( fun(x)   {
//        if( x == "stop") {
//            return@stop
//        }
//        else {
//            println("Signal: $x")
//        }
//    })

    printLambda1Param {
        println("Callback (Name): $it")
    }

    printLambda2Param { first: String, last: String ->
        println("Callback (Name): $first $last")
        println("Callback (Name): $first $last")
    }

    list.forEach {
        if( it == "stop") {
            return
        }
        else {
            println("Signal: $it")
        }
    }

}
fun testNullPointer(valueCanBeNull: String) {
    println("Dieser Wert kann auch null sein: ${valueCanBeNull}!")
}

fun showBinValue(value: Int) {
    println("Bin-Value: $value")

    showIntValue(value)
}

fun showIntValue(value: Int) {
    println("Int-Value: $value")
}


fun showCharacters(value: String) {
    value.forEach { print("[$it] ") }
}

fun printList() {
    val values = listOf<String>("Hallo", "dies", "ist", "ein", "Test")

    println()
    values.forEach { println("[$it] ") }
}

fun printAtoZ() {
    // a - z = ComparableRange
    println(listOf('a' .. 'z').flatten().toString())
    // [a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z]


    listOf('a'..'z').flatten().forEach { print("[$it] ") }
    //[a] [b] [c] [d] [e] [f] [g] [h] [i] [j] [k] [l] [m] [n] [o] [p] [q] [r] [s] [t] [u] [v] [w] [x] [y] [z]

    println()
}

@Suppress("RedundantIf", "SimplifyBooleanWithConstants", "ConstantConditionIf")
fun printControlFlowAsExpression() {
    val result = if ("Mike" == "mike")  true else false
    println("Mike == mike ergibt immer $result")
}

fun printZeroOrOne(value: Int) {
    val result = when(value) {
        0,1 -> true
        else -> false
        }
    println("$value ist 0 oder 1: ${(if(result) "ja" else "nein")}")

    val result2 = when {
        value <= 10 -> true
        else -> false
    }
    println("$value ist <= 10: ${(if(result2) "ja" else "nein")}")
}


