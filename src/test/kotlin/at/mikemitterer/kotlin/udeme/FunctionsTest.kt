package at.mikemitterer.kotlin.udeme

import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.FunSpec

fun tripple(value : Int) = value * 3

fun withDefaultValue(value:Int = 10) = value

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
    }

}