package calculator.operations.matrix;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

class MatrixPowerTest {

    MatrixPower m =new MatrixPower();


    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }


    @org.junit.jupiter.api.Test
    void powMat(){
        int[][] response =new int[][]{{67,66},{77,78}};
        assertEquals(response,m.powMat(new int[][]{{5,6},{7,6}},2),"testing");
    }

    @org.junit.jupiter.api.Test
    void testPowMat() {
    }

    @org.junit.jupiter.api.Test
    void identity() {
    }
}
