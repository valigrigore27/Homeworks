package com.yourpackage;

public class City extends Location {
    private int population;

    public City(String name, double x, double y, int population) {
        super(name, x, y);
        this.population = population;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + getName() + '\'' +
                ", population=" + population +
                '}';
    }
}
