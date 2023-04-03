import java.util.Arrays;
import java.util.stream.Collectors;

public class Matrix {

    private final int[][] matrix;


    public Matrix(int n) {
        this.matrix = new int[n][n];
    }


    public void init() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++)
                for (int k = 0; k < matrix.length; k++) {
                    matrix[i][j] = 0;
                }
        }
    }


    public void putRobotsInMatrix(int ID, int x, int y) {
        matrix[x][y] = ID;
    }

    public void print() {
        Arrays.stream(matrix).map(row -> Arrays.stream(row).mapToObj(String::valueOf).collect(Collectors.joining("   "))).forEach(System.out::println);
    }
}


