package com.yourpackage;

public abstract class Road {
    private String name;
    private Location start;
    private Location end;
    private double length;
    private int speedLimit;

    public Road(String name, Location start, Location end, double length, int speedLimit) {
        this.name = name;
        this.start = start;
        this.end = end;
        this.length = length;
        this.speedLimit = speedLimit;
    }

    public String getName() {
        return name;
    }

    public Location getStart() {
        return start;
    }

    public Location getEnd() {
        return end;
    }

    public double getLength() {
        return length;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    @Override
    public String toString() {
        return name;
    }
}
