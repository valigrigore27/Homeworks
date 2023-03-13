import java.util.HashMap;
import java.util.Map;

public class Node {

    private String name;
    private String birthDate ;//= "yyyy-MM-dd";
    private double height;
    private Map<String, Object> relationships;



    public String getName(){
        return name;
    }
    public String getBirthDate(){
        return birthDate;
    }
    public double height(){
        return height;
    }
    public void addRelationship(String key, Object value) {
        relationships.put(key, value);
    }

    public Object getNodeName() {
        return getName();
    }
}
