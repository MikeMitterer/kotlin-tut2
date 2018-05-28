package at.mikemitterer.kotlin.udemy

import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.FunSpec

/**
 *
 *
 * @since   07.01.18, 18:49
 */
class ControlFlowTest : FunSpec() {

    init {
        test("Describe your test") {
            for(a in (10 downTo 5)) {
                println(a)
            }

            val b = intArrayOf(6,7,8)
            for((index,value) in b.withIndex()) {
                println("$index:$value")
            }
        }

        test("When") {
            val code = 39

            val result = when(code) {
                44 -> "UK"
                46 -> "Sweden"
                39, 379 -> "Vatican"
                in 100..200 -> "Unknown"
                else -> "Invalid"
            }

            result shouldBe "Vatican"
        }

        test("When mit Type-Check") {
            val code:Any = 10
            
            val result:Any = when(code) {
                is Int -> "Integer"
                is String -> "String"
                else ->  "Unknown"
            }
            result shouldBe "Integer"
        }

     }

}