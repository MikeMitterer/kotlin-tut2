package at.mikemitterer.kotlin.c5

import org.junit.Test
import kotlin.test.assertEquals

class TestLambdas {

    @Test
    fun testMiniDSL() {
        val result = miniDSL { "Hallo" + "Test" }
        assertEquals("HalloTest", result)

        val result2 = miniDSL({
            "Hallo" + "Test"
        })
        assertEquals("HalloTest", result2)
    }

    @Test
    fun testMultiRetValue() {
        val (name, age) = multiReturnValues()
        assertEquals("Mike", name)
        assertEquals(51, age)
    }

    @Test
    fun testFunctionWithTwoParams() {
        val result = functionWithTwoParams("Mike", { name, age ->
            "Name: $name, Age: $age"
        })
        assertEquals("Name: Mike, Age: 51", result)
    }

    @Test
    fun testReceiver() {
        // Temporäre Lambda
        val increaseBy = fun Int.(value: Int) = this + value
        assertEquals(5, 1.increaseBy(4))
    }

    @Test
    fun testFunctor() {
        val nf = NameFunctor()
        assertEquals("Name: Mike", nf("Mike"))
    }
}

