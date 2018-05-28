package at.mikemitterer.kotlin.c3

import org.junit.Test
import kotlin.test.assertEquals


/**
 * @since 08.12.17, 10:14
 */
class SinletonSampleTest {

    @Test
    fun testCount() {
        val singleton = SingletonSample
        assertEquals(singleton.counter,0)
        assertEquals(singleton.count(),0)
        assertEquals(singleton.counter,1)

        val singleton2 = SingletonSample
        assertEquals(singleton2.counter,1)
    }
}