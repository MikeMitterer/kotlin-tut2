package at.mikemitterer.kotlin.c3

import org.junit.Test
import kotlin.test.assertEquals

/**
 *
 *
 * @since   04.12.17, 18:24
 */
class TestEnumSample {
    @Test
    fun testDays() {
        val day = Day.Montag
        assertEquals(day, Day.Montag)
        assertEquals(0,day.ordinal)
    }

    @Test
    fun testPlanet() {
        val planet = Planet.Erde
        assertEquals(5.9,planet.radius)
    }

    @Test
    fun testEnumName() {
        val person = SpecificPerson.MIKE
        assertEquals("MIKE",person.name)
    }

    @Test
    fun testPrintString() {
        val person = SpecificPerson.MIKE
        assertEquals("Ich bin Mike",person.printString())
    }
}