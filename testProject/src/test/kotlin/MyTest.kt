import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MyTest {

    @Test
    fun testSomething() {
        val res = TestClass().something
        Assertions.assertEquals("Got it!", res)
    }

}