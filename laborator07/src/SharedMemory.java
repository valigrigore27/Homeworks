public class SharedMemory {

   private int[] tokens;

    public SharedMemory(int[] tokens) {
        this.tokens = tokens;
    }

    public int[] getTokens() {
        return tokens;
    }

    public void setTokens(int[] tokens) {
        this.tokens = tokens;
    }
    public int length(){
        return getTokens().length;
    }

}