package at.mikemitterer.kotlin.udemy

import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.FunSpec

fun tripple(value : Int) = value * 3

fun withDefaultValue(value:Int = 10) = value

fun moreValues(vararg values: Int) : Int {
    //    var result:Int = 0
    //    values.forEach { value -> result += value }
    //    return result;

    return values.sum();
}

infix fun Double.average(other: Double) : Double {
    return (this + other) / 2.0
}

/**
 *
 *
 * @since   07.01.18, 19:10
 */
class FunctionsTest : FunSpec() {

    init {
        test("Describe your test") {
            tripple(3) shouldBe 9
            withDefaultValue() shouldBe 10
        }

        test("Varargs sollten in Summe 10 ergeben") {
            val arrayToMerge = intArrayOf(2,3,5)
            moreValues(2,3,*arrayToMerge,5) shouldBe 20

            // Mit Lambda
            var mySum = 0
            arrayToMerge.forEach { mySum+= it }
            mySum shouldBe 10
        }

        test("Infix Sample") {
            10.0 average 20.0 shouldBe 15.0
        }
    }


}