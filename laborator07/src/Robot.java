public class Robot {
    private int ID;
    private int posX;
    private int posY;

    public Robot(int ID, int posX, int posY){
        this.ID=ID;
        this.posX=posX;
        this.posY=posY;
    }

    public int getID() {
        return ID;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    @Override
    public String toString(){
        return "Robot " + getID()+ "is at line " +getPosX() + "and column" + getPosY();
    }
}
