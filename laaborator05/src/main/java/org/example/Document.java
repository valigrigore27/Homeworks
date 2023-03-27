package org.example;

public class Document {


    private  String name;
    private  int id;
    private String path;

    public Document(String name, int id, String path) {
        this.name = name;
        this.id = id;
        this.path=path;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    public String getPath() {
        return path;
    }

    @Override
    public String toString() {
        return "Document: " + "{" + "name: " + name + ", id: " + id + "}";
    }


}
