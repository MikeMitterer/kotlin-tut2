package at.mikemitterer.kotlin.udemy

import io.kotlintest.Description
import io.kotlintest.TestResult
import io.kotlintest.specs.FunSpec

/**
 *
 *
 * @since   10.03.18, 19:07
 */
class CollectionsKotlinTest : FunSpec() {
    var started = 0L

    init {
        test("Describe your test - 1") {
            println("Hallo")
            Thread.sleep(500)
        }

        test("Describe your test - 2") {
            println("Hallo2")
            Thread.sleep(500)
        }
    }

    override fun beforeTest(description: Description) {
        super.beforeTest(description)

        started = System.currentTimeMillis()
    }

    override fun afterTest(description: Description, result: TestResult) {
        super.afterTest(description, result)

        val finished = System.currentTimeMillis()
        val time = finished - started

        println("Test '${description.name}' took time [ms]: $time\n")
    }
}