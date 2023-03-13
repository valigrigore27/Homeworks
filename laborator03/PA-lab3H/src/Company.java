import java.util.*;

public class Company extends Node implements Comparable<Company> {
    private String name;
    private int establishmentYear;
    private String countryOfOrigin;
    private Map<String, Object> relationships;

    public Company(String name, int establishmentYear, String countryOfOrigin) {
        this.name = name;
        this.countryOfOrigin = countryOfOrigin;
        this.establishmentYear = establishmentYear;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getName() {
        return name;
    }

    public int getEstablishmentYear() {
        return establishmentYear;
    }

    public void addRelationship(String key, Object value) {
        relationships.put(key, value);
    }

    public Object getRelationship(String key) {
        return relationships.get(key);
    }

    @Override
    public int compareTo(Company other) {
        return this.getName().compareTo(other.getName());
    }

    @Override
    public String getNodeName() {
        return getName();
    }
}
