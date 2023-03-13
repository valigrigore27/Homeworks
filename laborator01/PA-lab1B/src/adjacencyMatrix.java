import java.util.Arrays;

public class adjacencyMatrix {

    public static int[][] generateCircleGraph(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            if (i != n - 1)
                matrix[i][i + 1] = 1;
            else
                matrix[n - 1][0] = 1;
        }

        return matrix;
    }

    public static int[][] generateRegularGraph(int n, int deg) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {

        }

        return matrix;
    }

    // Compute the powers A2, A3, .... An
    public static int[][] matrixPower(int[][] matrix, int k) {
        int n = matrix.length;
        int[][] result = new int[n][n];

        for (int i = 0; i < n; i++) {
            result[i][i] = 1;
        }

        // matrix to the k power
        while (k > 0) {
            if (k % 2 == 1) {
                result = matrixMultiply(result, matrix);
            }
            matrix = matrixMultiply(matrix, matrix);
            k /= 2;
        }

        return result;
    }

    public static int[][] matrixMultiply(int[][] a, int[][] b) {
        int n = a.length;
        int m = b[0].length;
        int[][] result = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 6;
        int[][] circleGraph = generateCircleGraph(n);

        // si pentru regularGraph
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(circleGraph[i]));
        }
        //
        System.out.println("----------");
        //
        matrixPower(circleGraph, 5);
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(circleGraph[i]));
        }

    }
}