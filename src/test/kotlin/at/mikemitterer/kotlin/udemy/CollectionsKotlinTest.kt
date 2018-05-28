package at.mikemitterer.kotlin.udemy

import io.kotlintest.TestCaseContext
import io.kotlintest.specs.FunSpec

/**
 *
 *
 * @since   10.03.18, 19:07
 */
class CollectionsKotlinTest : FunSpec() {
    init {
        test("Describe your test") {
            println("Hallo")
            Thread.sleep(500)
        }

        test("Describe your test") {
            println("Hallo2")
            Thread.sleep(500)
        }
    }

    override fun interceptTestCase(context: TestCaseContext, test: () -> Unit) {
        // before
        val started = System.currentTimeMillis()

        test() // don't forget to call test()!

        // after
        val finished = System.currentTimeMillis()
        val time = finished - started
        println("time [ms]: $time")
    }

}