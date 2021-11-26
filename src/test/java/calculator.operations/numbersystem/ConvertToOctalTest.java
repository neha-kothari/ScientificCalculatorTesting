package calculator.operations.numbersystem;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertToOctalTest {

    ConvertToOctal cto = new ConvertToOctal();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void convertToOctal() {
    }

    @Test
    void binary() {

       assertEquals(17, cto.binary(1111));
       assertEquals(-1, cto.binary(-2));
       assertEquals(3, cto.binary(11));
       assertEquals(1,cto.binary(1));
    }

    @Test
    void decimal() {

        assertEquals(17, cto.decimal(15));
        assertEquals(-144, cto.decimal(-100));
        assertEquals(1, cto.decimal(1));
        assertEquals(0, cto.decimal(0));

    }

    @Test
    void hexadecimal() {

        assertEquals(21, cto.hexadecimal("11"));
        assertEquals(-1, cto.hexadecimal("-100"));
        assertEquals(1, cto.hexadecimal("1"));
    }
}
