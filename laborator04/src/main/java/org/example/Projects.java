package org.example;

public class Projects implements Comparable<Projects>{
    private String name;
    public String getName() {
        return name;
    }
    public Projects(String name){
        this.name=name;
    }

    @Override
    public int compareTo(Projects other) {
        return this.getName().compareTo(other.getName());
    }

    public String toString() {
        return
                name
                ;
    }


}
