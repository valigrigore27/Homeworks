import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Matrix matrix = new Matrix(6);
        matrix.putRobotsInMatrix(3,2, 2);
        matrix.putRobotsInMatrix(5,0, 2);

        matrix.print();

    }
}