public class Designer extends Person {
    private String graphicsProgram;
    public Designer(String name, String birthDate, double height, String graphicsProgram){
        super(name,birthDate,height);
        this.graphicsProgram=graphicsProgram;
    }
    public String getGraphicsProgram(){
        return graphicsProgram;
    }

}
