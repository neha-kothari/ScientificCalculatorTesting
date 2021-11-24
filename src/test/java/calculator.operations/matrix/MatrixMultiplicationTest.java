package calculator.operations.matrix;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixMultiplicationTest {

    MatrixMultiplication m = new MatrixMultiplication();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void multiply() {
        int[][] expresponse =new int[][]{{4,4},{10,8}};
        int[][] response = m.multiply(new int[][]{{1,2},{3,4}}, new int[][]{{2,0},{1,2}});
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                assertEquals(response[i][j],expresponse[i][j],"testing");
            }
        }
    }

    @Test
    void multiplyZero() {
        int[][] response = m.multiply(new int[0][0], new int[0][0]);
        assertEquals(0,response.length,"testing");
    }

    @Test
    void multiplyOnce() {
        int[][] expresponse =new int[][]{{1}};
        int[][] response = m.multiply(new int[][]{{1}}, new int[][]{{1}});
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 1; j++) {
                assertEquals(response[i][j],expresponse[i][j],"testing");
            }
        }
    }
}
