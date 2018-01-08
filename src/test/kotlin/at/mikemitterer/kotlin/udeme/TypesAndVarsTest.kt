package at.mikemitterer.kotlin.udeme


import org.junit.Test
import kotlin.test.assertEquals

/**
 *
 *
 * @since   06.01.18, 15:27
 */
class TypesAndVarsTest {

    @Test
    fun testRanges() {
        val a:IntRange = 1..10
        assertEquals(2,a.elementAt(1))

        val b = (100..110).reversed()
        assertEquals(109,b.elementAt(1))

        val c = 200.rangeTo(210)
        assertEquals(201,c.elementAt(1))

        // Rangen nach unten
        val d = 10.downTo(1)
        val e = 10 downTo 1
        assertEquals(9,d.elementAt(1))
        assertEquals(9,e.elementAt(1))

        var f = 10..20 step 2
        assertEquals(12,f.elementAt(1))

        for(x in a.reversed()) {
            println(x)
        }

        b.forEach { println("Print IT: $it") }
        b.forEach { param:Int -> println("Print defined param: $param") }
        c.forEach({ value -> println("Print with Lambda: $value")})
    }
}