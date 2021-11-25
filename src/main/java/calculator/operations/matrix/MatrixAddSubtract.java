package calculator.operations.matrix;

public class MatrixAddSubtract {
    //Add two matrices
    public int[][] matrixAdd(int[][] matrix1, int[][] matrix2 ) {
        int r = matrix1.length;
        int c= matrix1.length;
        int[][] result = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        return result;
    }

    //Subtract two matrices
    public int[][] matrixSubtract(int[][] matrix1, int[][] matrix2 ) {
        int r = matrix1.length;
        int c= matrix1.length;
        int[][] result1 = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result1[i][j]=matrix1[i][j]-matrix2[i][j];
            }
        }
        return result1;
    }
}
