package calculator.operations.algebra;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class FactorialTest {

    Factorial f = new Factorial();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void factorial() {
        assertEquals(24,f.factorial(4),"testing factorial for n > 1");
        assertEquals(1, f.factorial(0),"Testing factorial for n = 0");
        assertEquals(1, f.factorial(1), "Testing factorial for n = 1");
        assertEquals(0, f.factorial(-1), "Testing factorial for n < 0");
    }


}
