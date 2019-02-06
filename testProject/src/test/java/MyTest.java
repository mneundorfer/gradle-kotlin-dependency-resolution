import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyTest {

    @Test
    public void testSomething() {
        String res = new TestClass().getSomething();
        Assertions.assertEquals("Got it!", res);
    }

}