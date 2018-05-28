package at.mikemitterer.kotlin.udemy


import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.FunSpec
import kotlin.test.assertTrue

/**
 *
 *
 * @since   06.01.18, 16:03
 */
class ArraysTest : FunSpec() {

    init {
        test("String-Liste") {
            val names  = arrayOf("Mike", "Gerda", "Sarah")

            names[1] shouldBe "Gerda"

            // toList ist notwendig da 'names' nur die Adresse des Arrays ausgibt
            println(names.toList())
        }

        test("Int-Liste") {
            val ages = intArrayOf(10,20,30)
            ages[1] shouldBe 20

            val numbers = arrayOf(1,2,3)
            numbers[1] shouldBe 2
        }

        test("Generics-Liste") {
            // Der zweite Param ist eine Funktion!!!!
            val values1 = Array<Double>(10,{ 20.0 })
            assertTrue { values1.size == 10 }

            val values2 = Array(10,{ it * it })
            assertTrue { values2.size == 10 }
            values2[2] shouldBe 4
        }
    }
}