import java.util.Arrays;
import java.util.stream.Collectors;
public class Matrix {

    private  int[][][] matrix;

    public Matrix(int n) {
        this.matrix = new int[n][n][n];
    }

    public int[][][] getMatrix() {
        return matrix;
    }

    public void putTokenInMatrix(int ord, int line, int column, int token) {
        matrix[ord][line][column] = token;
    }

    public int getElementsFromMatrix(int ord, int line, int column) {
        return matrix[ord][line][column];
    }
    public void  elemEqualValue(int ord, int line, int column, int value){
        matrix[ord][line][column]=value;
    }

    public void print() {
        for (int[][] layer : getMatrix()) {
            for (int[] row : layer) {
                System.out.println(Arrays.toString(row));
            }
            System.out.println();
        }
    }
    public int length(){
        return getMatrix().length;
    }
}