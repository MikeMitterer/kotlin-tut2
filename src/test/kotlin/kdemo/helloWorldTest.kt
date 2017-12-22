package kdemo

import demo.Greeter
import org.junit.Test
import kotlin.test.assertEquals

class helloWorldTest {

    @Test
    fun f() {
        val example : KotlinGreetingJoiner = KotlinGreetingJoiner(Greeter("Hi"))
        example.addName("Harry")
        example.addName("Ron")
        example.addName(null)
        example.addName("Hermione")

        assertEquals(example.getJoinedGreeting(), "Hi Harry and Ron and Hermione")
    }

    @Test
    fun myName() {
        val name = "Mike"
        assertEquals(name, "Mike")
    }
}