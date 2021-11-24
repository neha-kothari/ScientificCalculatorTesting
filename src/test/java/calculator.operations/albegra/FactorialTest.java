package calculator.operations.albegra;
import static org.junit.jupiter.api.Assertions.*;
import calculator.operations.algebra.Factorial;
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
        assertEquals(24,f.factorial(4),"testing factorial");
    }
}
