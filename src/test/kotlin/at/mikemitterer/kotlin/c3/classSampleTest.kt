package at.mikemitterer.kotlin.c3

/**
 *
 *
 * @since   05.11.17, 18:20
 */

import org.junit.Test
import kotlin.test.assertEquals

class TestOOP {

    @Test fun myName() {
        val name = "Mike"
        assertEquals(name, "Mike")
    }

    @Test
    fun testInternalKeyword() {
        val internalTest = InternalTest("Mike", 18)
        assertEquals("Mike",internalTest.name)
    }

    @Test
    fun testCTORParam() {
        val internalTest = InternalTest("Mike", 51)
        assertEquals(102,internalTest.myAge)

    }

    @Test
    fun testInnerClass() {
        val ic = InnerClassSample("Mike","Gerda")

        assertEquals("Mike",ic.name)
        assertEquals("Gerda",ic.partner.name)
        assertEquals("Mike + Gerda, Cat makes Miau",ic.partner.relation)

        val partner = ic.Partner("Test")
        assertEquals("Mike + Test, Cat makes Miau",partner.relation)

        val pet = InnerClassSample.Pet("Wuff")
        assertEquals("Wuff",pet.sound)
    }

    @Test
    fun testAnonymousTest() {
        val result = halloCallback(object: MySpecialClass {
            override fun giveName(): String = "Mike"
        })

        assertEquals("Mike",result)
    }

    @Test
    fun testPrivateVar() {
        val pvs = PrivateVarsSample("Mike")
        assertEquals(pvs.myName, "Mike")

    }

    @Test
    fun testMultipleCTORs() {
        val mctor = MultipleCTORs("Mike")
        assertEquals("Mike <default>", mctor.name)
    }

    @Test
    fun testSuperCall() {
        val car = Car("Käfer")
        assertEquals(4,car.wheels)
    }

    @Test
    fun testConstuctorInvocation() {
        val motorcyle = Motorcycle()
        assertEquals(2,motorcyle.wheels)
    }
}

