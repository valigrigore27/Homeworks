public class Robot {
    private int id;
    private final int posX;
    private final int posY;
    private final SharedMemory sharedMemory;
    private final Matrix matrix;
    private int tokensPlacedInMatrix;

    public Robot(int posX, int posY, SharedMemory sharedMemory, Matrix matrix, int id) {
        this.posX = posX;
        this.posY = posY;
        this.sharedMemory = sharedMemory;
        this.matrix = matrix;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getTokensPlacedInMatrix() {
        return tokensPlacedInMatrix;
    }

    public void setTokensPlacedInMatrix(int tokensPlacedInMatrix) {
        this.tokensPlacedInMatrix = tokensPlacedInMatrix;
    }

    public int incTokensPlacedInMatrix() {
        return tokensPlacedInMatrix++;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public SharedMemory getSharedMemory() {
        return sharedMemory;
    }

    public Matrix getMatrix() {
        return matrix;
    }
}
