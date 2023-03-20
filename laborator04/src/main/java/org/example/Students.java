package org.example;


import java.util.List;

public class Students implements Comparable<Students> {

    private String name;
    private List<Projects> projects;

    public Students(String name, List<Projects> projects) {
        this.name = name;
        this.projects = projects;
    }

    public String getName() {
        return name;
    }

    public List<Projects> getProjects() {
        return projects;
    }
    public int sizeOfProjectsList(){
        return projects.size();
    }

    @Override
    public int compareTo(Students other) {
        return this.getName().compareTo(other.getName());
    }

    @Override
    public String toString() {
        return
                name + ": " + projects
                ;
    }


}
