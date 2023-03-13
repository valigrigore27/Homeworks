package com.yourpackage;

public class Airport extends Location {
    private int numTerminals;
    private boolean hasGasStation;

    public Airport(String name, double x, double y, int numTerminals, boolean hasGasStation) {
        super(name, x, y);
        this.numTerminals = numTerminals;
        this.hasGasStation = hasGasStation;
    }

    public int getNumTerminals() {
        return numTerminals;
    }

    public boolean hasGasStation() {
        return hasGasStation;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "name='" + getName() + '\'' +
                ", numTerminals=" + numTerminals +
                ", hasGasStation=" + hasGasStation +
                '}';
    }
}
