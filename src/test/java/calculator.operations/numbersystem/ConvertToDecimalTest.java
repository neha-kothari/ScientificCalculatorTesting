package calculator.operations.numbersystem;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertToDecimalTest {

    ConvertToDecimal cdt = new ConvertToDecimal();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void octal() {
        assertEquals("57", cdt.octal(71));
        assertEquals("Error", cdt.octal(8));
        assertEquals("Error", cdt.octal(91));
        assertEquals("Error", cdt.octal(-1));
    }

    @Test
    void binaryToDecimal() {
        assertEquals("2", cdt.binary(2));
        assertEquals("21", cdt.binary(10101));
        assertEquals("16", cdt.binary(10000));
        assertEquals("Error", cdt.binary(-1));
    }

    @Test
    void hexadecimalToBinary() {
        assertEquals("2", cdt.hexadecimal("2"));
        assertEquals("15", cdt.hexadecimal("F"));
        assertEquals("0", cdt.hexadecimal(""));
        assertEquals("Error", cdt.hexadecimal("-1"));
    }
}
