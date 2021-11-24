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
        int[][] expresponse =new int[][]{{67,66},{77,78}};
        int[][] response = m.powMat(new int[][]{{5,6},{7,6}}, 2);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                assertEquals(response[i][j],expresponse[i][j],"testing");
            }
        }
    }

    @org.junit.jupiter.api.Test
    void testPowMat() {
    }

    @org.junit.jupiter.api.Test
    void identity() {
    }
}
