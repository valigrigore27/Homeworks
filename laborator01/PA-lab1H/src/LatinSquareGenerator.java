import java.util.Arrays;

public class LatinSquareGenerator {

    public static int[][] generateLatinSquare(int n) {
        int[][] matrix = new int[n][n];

        // Initialize the first row with symbols 1 to n
        for (int i = 0; i < n; i++) {
            matrix[0][i] = i + 1;
        }

        // Generate the remaining rows using cyclic shift
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = matrix[i-1][(j+1)%n];
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] latinSquare = generateLatinSquare(n);
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(latinSquare[i]));
        }

        // Create and print String objects for each row
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append(latinSquare[i][j]);
            }
            System.out.println("Row " + (i + 1) + ": " + sb.toString());
        }

        // Create and print String objects for each column
        for (int j = 0; j < n; j++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(latinSquare[i][j]);
            }
            System.out.println("Column " + (j + 1) + ": " + sb.toString());
        }
    }
}
