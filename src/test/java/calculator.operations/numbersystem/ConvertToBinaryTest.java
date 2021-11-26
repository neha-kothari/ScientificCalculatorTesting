package calculator.operations.numbersystem;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ConvertToBinaryTest {

    ConvertToBinary cbt =new ConvertToBinary();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void menuTest() {

        assertEquals("10", cbt.menu(1, "2").toString());
        assertEquals("101010110001001000110000", cbt.menu(2, "AB1230").toString());
        assertEquals("001010011000", cbt.menu(3, "1230").toString());
        assertEquals("Wrong Input!", cbt.menu(4, "").toString());
    }

    @Test
    void convertDecimalToBinary() {
        assertEquals("10", cbt.decimalToBinary(2).toString());
        assertEquals("10101", cbt.decimalToBinary(21).toString());
        assertEquals("", cbt.decimalToBinary(-1).toString());
        assertNotEquals("10101", cbt.decimalToBinary(2).toString());
    }

    @Test
    void convertHexadecimalToBinary() {
        assertEquals("101010110001001000110000", cbt.hexadecimalToBinary("AB1230").toString());
        assertEquals("11001101010001010110", cbt.hexadecimalToBinary("CD456").toString());
        assertEquals("11100111100010011111", cbt.hexadecimalToBinary("E789F").toString());
        assertEquals("", cbt.hexadecimalToBinary("").toString());
        assertEquals("", cbt.octalToBinary("Y").toString());
    }

    @Test
    void convertOctalToBinary() {
        assertNotEquals("1010011000", cbt.octalToBinary("1230").toString());
        assertEquals("100101110111", cbt.octalToBinary("4567").toString());
        assertEquals("001010011000", cbt.octalToBinary("1230").toString());
        assertEquals("", cbt.octalToBinary("").toString());
        assertEquals("", cbt.octalToBinary("9").toString());
    }
}
