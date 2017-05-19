
import demo.Greeter
import kdemo.KotlinGreetingJoiner
import kotlin.test.assertEquals
import org.junit.Test as test

class TestSource() {
    @org.junit.Test fun f() {
        val example : KotlinGreetingJoiner = KotlinGreetingJoiner(Greeter("Hi"))
        example.addName("Harry")
        example.addName("Ron")
        example.addName(null)
        example.addName("Hermione")

        assertEquals(example.getJoinedGreeting(), "Hi Harry and Ron and Hermione")
    }
}

