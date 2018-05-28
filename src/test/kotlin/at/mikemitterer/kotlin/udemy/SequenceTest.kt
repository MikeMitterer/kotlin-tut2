package at.mikemitterer.kotlin.udemy

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 *
 *
 * @since   10.03.18, 19:31
 */
class SequenceTest {
    @Test
    fun testSequence() {
        val gen = generateSequence(1, { it + 1 })
        val numbers = gen.take(20)

        assertEquals(20, numbers.toList().size)

        listOf(1, 2, 3, 4, 5, 6, 7, 8, 9).forEach {
            if (it > 5) {
                // Praktisch wie continue in einer normalen loop
                return@forEach
            }
            println("Val I: $it")
        }
        println("Ende 1\n")

        run loop@ {
            gen.forEach {
                if (it >= 10) {
                    // Praktisch wie continue in einer normalen loop
                    // return@forEach (funkt hier nicht da die Liste endlos ist
                    return@loop
                }
                println("Val: $it")
            }
        }
        println("Ende")
    }

    @Test
    fun testContains() {
        val ints = arrayListOf<Int>(1, 2, 3, 4, 5).asSequence()
        assertTrue(ints.contains(5))

        assertEquals(2,ints.count { it > 3 })
    }
}