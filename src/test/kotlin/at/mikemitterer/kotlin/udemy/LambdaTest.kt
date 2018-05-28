package at.mikemitterer.kotlin.udemy

import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.FunSpec

/**
 *
 *
 * @since   13.01.18, 18:12
 */
class LambdaTest : FunSpec() {

    init {
        test("Simple Lambda-Test") {
            // Variante 1
            val productV1 = { x:Int, y:Int -> x*y }
            productV1(2,3) shouldBe 6

            // Variante 2
            val productV2:(Int,Int) -> Int = {x,y -> x*y}
            productV2(2,3) shouldBe 6
        }

        test("Lambda als Parameter") {
            val myList = listOf(1,2,3,4)

            myList.count() shouldBe 4

            // Aufzählen mit Lambda
            myList.count({ value -> value >= 3}) shouldBe 2

            // Ist bei einer Funktion nur ein Param vorhanden kann
            // die runde Klammer weggelassen werden
            myList.count { value -> value >= 3} shouldBe 2

            // it ist implizit
            myList.count { it >= 3} shouldBe 2
        }
    }

}