package at.mikemitterer.kotlin.udemy

import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.FunSpec

/**
 *
 *
 * @since   07.01.18, 18:35
 */
class NullabilityTest : FunSpec() {

    init {
        test("Nullable type") {
            var a:String? = null
            
            a shouldBe null

            a?.length ?: -1 shouldBe -1
        }
    }

}