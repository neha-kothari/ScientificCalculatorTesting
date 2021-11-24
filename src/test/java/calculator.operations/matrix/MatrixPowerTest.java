package calculator.operations.matrix;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
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


    @Test
    void powZeroMat(){
        int[][] expresponse =new int[][]{{1,0},{0,1}};
        int[][] response = m.powMat(new int[][]{{5,6},{7,6}}, 0);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                assertEquals(response[i][j],expresponse[i][j],"testing");
            }
        }
    }

    @Test
    void powOneMat(){
        int[][] expresponse =new int[][]{{5,6},{7,6}};
        int[][] response = m.powMat(new int[][]{{5,6},{7,6}}, 1);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                assertEquals(response[i][j],expresponse[i][j],"testing");
            }
        }
    }

    @Test
    void powTwoMat(){
        int[][] expresponse =new int[][]{{67,66},{77,78}};
        int[][] response = m.powMat(new int[][]{{5,6},{7,6}}, 2);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                assertEquals(response[i][j],expresponse[i][j],"testing");
            }
        }
    }

    @Test
    void powThreeMat(){
        int[][] expresponse =new int[][]{{20,14},{28,20}};
        int[][] response = m.powMat(new int[][]{{2,1},{2,2}}, 3);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                assertEquals(response[i][j],expresponse[i][j],"testing");
            }
        }
    }

    @Test
    void identityMat(){
        int[][] expresponse =new int[][]{{1,0},{0,1}};
       int[][] response = m.identity(2);

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
