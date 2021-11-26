package calculator.operations.numbersystem;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertToHexadecimalTest {

    ConvertToHexadecimal cth = new ConvertToHexadecimal();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void convertToHexadecimal() {
    }

    @Test
    void decimalToHex() {
        assertEquals("f", cth.decimalToHex(15));
        assertEquals("64", cth.decimalToHex(100));
        assertNotEquals("0", cth.decimalToHex(1));
    }

    @Test
    void binaryToHex() {
        assertEquals("F", cth.binaryToHex(1111));
        assertEquals("40", cth.binaryToHex(1000000));
        assertNotEquals("0", cth.binaryToHex(1));
        assertEquals("\tThe Entered Number is not a Binary Number ",
                cth.binaryToHex(152));
    }

    @Test
    void octalToHex() {
        assertEquals("\tThe Entered Number is not Octal Number ", cth.octalToHex("8"));
        assertEquals("26", cth.octalToHex("46"));
        assertNotEquals("0", cth.octalToHex("1"));
    }
}
