package calculator.operations.matrix;

public class MatrixPower {

    MatrixMultiplication matMult = new MatrixMultiplication();

    // Function to perform matrix ^ power.
    public int[][] powMat(int[][] matrix, int power) {
        int N = matrix[0].length;
        int[][] result = new int[N][N];

        if(power == 0)
            return identity(N);

        else if(power == 1)
            return matrix;

        if(power % 2 == 0)
            result = powMat(matMult.multiply(matrix, matrix), power / 2);

        else
            result = matMult.multiply(powMat(matMult.multiply(matrix, matrix), power / 2), matrix);

        return result;
    }

    // Function to return identity matrix of dimension N x N.
    int[][] identity(int N) {
        int[][] I = new int[N][N];

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(i == j)
                    I[i][j] = 1;
                else
                    I[i][j] = 0;
            }
        }
        return I;
    }

}
