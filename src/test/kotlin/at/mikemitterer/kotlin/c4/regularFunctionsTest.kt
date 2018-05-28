package at.mikemitterer.kotlin.c4

import at.mikemitterer.kotlin.c5.*
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

class TestFunctions {

    @Test
    fun testShowMyName() {
        assertEquals("Name Mike, Alter: 50...", showMyName("Mike"))
        assertEquals("Name Mike, Alter: 40...", showMyName("Mike", age = 40))
    }

    @Test
    fun testNestedFunction() {
        val result = nestedFunction("Mike")
        assertEquals("Mike51", result)
    }

    @Test
    fun testRequire() {
        assertEquals(40, requireTest(40))
    }

    @Test
    fun testRequiteException() {
        assertFailsWith<IllegalArgumentException> {
            requireTest(30)
        }
    }

    @Test
    fun testNamedParams() {
        assertEquals("Name: Mike, Age: 51", namedParams("Mike", age = 51))
    }

    @Test
    fun testExtensionFunction() {
        assertEquals("Mike - say: Shut up!", "Mike".say("Shut up!"))
    }

    @Test
    fun testExtensionFunctionInClass() {
        val test = ExtendClassWithScope("Peppels")
        assertEquals("Mike: (shout) Peppels - no clue", test.shout())
    }

    @Test
    fun testBoolExtension() {
        fun Boolean.isTrue(callback: () -> Unit) {
            if(this) callback()
        }

        var counter = 0
        
        true.isTrue { counter++ }
        false.isTrue { counter++ }

        assertEquals(1,counter)

        counter = 0
        var name : String = "Mike"
        (name.length > 5).isTrue {  counter ++ }

        assertEquals(0,counter)

    }

    @Test(expected = AssertionError::class)
    fun testExtendCompanion() {
        val random = Int.random()
        assertTrue(message = "Random-Value should be 10 || 11 but was $random") {
            random == 10 || random == 11
        }
    }

    @Test
    fun testMyAssert() {
        val result1 = myAssert(name = "Hallo") {
            "Mike"
        }

        val result2 = myAssert {
            "Mike"
        }

        assertEquals("Hallo -> Mike", result1)
        assertEquals("Mike", result2)
    }


}

