package com.yourpackage;
import com.yourpackage.LocationType;

/**
 * Apoi pentru a inlocui enumerarea am creat doua clase pentru locatie (Una City si una Airport adaugand la fiecare proproetati specifice suplimentare (subpunctul3) acelasi lucru facandu-l si pentru Road-uri
 */
public class Location {
    private String name;
    private double x;
    private double y;

    public Location(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return name;
    }
}

