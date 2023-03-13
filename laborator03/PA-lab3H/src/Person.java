import java.util.*;
public class Person extends Node implements Comparable<Person> {
    private String name;
    private String birthDate ;//= "yyyy-MM-dd";
    private double height;
    private Map<String, Object> relationships;

    public Person (String name, String birthDate, double height){
        this.name=name;
        this.birthDate=birthDate;
        this.height=height;
        this.relationships = new HashMap<>();
    }

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

    public Object getRelationship(String key) {
        return relationships.get(key);
    }
    @Override
    public int compareTo(Person other) {
        return this.getName().compareTo(other.getName());
    }

    @Override
    public String getNodeName() {
        return getName();
    }

}
