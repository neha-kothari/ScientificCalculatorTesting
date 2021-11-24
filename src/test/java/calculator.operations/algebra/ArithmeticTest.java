package calculator.operations.algebra;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.InputStream;


class ArithmeticTest {

    Arithmetic a = new Arithmetic();
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void arithmetic() {
        assertEquals(15, a.doMath("1", 10, 5), "Addition Test Successful");
        assertEquals(5, a.doMath("2", 10, 5), "Subtraction Test Successful");
        assertNotEquals(6, a.doMath("2", 10, 5));
        assertEquals(2.0, a.doMath("3", 10.0, 5.0), "Division Test Successful");
        assertEquals(20, a.doMath("4", 5, 4), "Multiplication Test Successful");
       // assertEquals(2.0, a.doMath("5", 10.0, 5.0), "Division Test Successful");
    }

    //@Test(expected = IllegalStateException.class)

    public void validException(){
        assertEquals(2.0, a.doMath("5", 10.0, 5.0), "Division Test Successful");
    }


}
