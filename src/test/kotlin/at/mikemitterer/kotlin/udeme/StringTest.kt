package at.mikemitterer.kotlin.udeme

import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.FunSpec


/**
 * Sample für Kotlin-Tests
 *
 * Weitere Infos:
 *      https://github.com/kotlintest/kotlintest/blob/master/doc/reference.md
 */
class StringTest : FunSpec() {
    init {
        test("String sollte mit 'hallo' starten") {
            val temp = "halloWelt"
            temp shouldBe "halloWelt"
        }

        test("Raw-Strings") {
            /// Tripple-Quote startet einen "raw-String"
            val raw = """
                Hallo
                ein
                Test
                """
            raw[0].toInt() shouldBe 10
        }

        test ("String interpolation") {
            val value = 10;
            "\$$value" shouldBe "\$10"
        }
    }
}