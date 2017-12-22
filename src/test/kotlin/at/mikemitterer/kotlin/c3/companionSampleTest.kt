package at.mikemitterer.kotlin.c3

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 *
 *
 * @since   05.11.17, 18:20
 */

class TestCompanionSample {
    @Test
    fun testPetFactory() {
        val pet1 = Cat.create("Pepples")
        val pet2 = Dog.create("Rolf")

        assertTrue { pet1 is Cat }
        assertTrue { pet2 is Dog }

        assertEquals(pet1.name,"Pepples")
    }
}

