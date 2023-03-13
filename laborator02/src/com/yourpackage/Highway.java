package com.yourpackage;

public class Highway extends Road {
    private boolean hasToll;

    public Highway(String name, Location start, Location end, double length, int speedLimit, boolean hasToll) {
        super(name, start, end, length, speedLimit);
        this.hasToll = hasToll;
    }

    public boolean hasToll() {
        return hasToll;
    }

    @Override
    public String toString() {
        return "Highway{" +
                "name='" + getName() + '\'' +
                ", start=" + getStart() +
                ", end=" + getEnd() +
                ", length=" + getLength() +
                ", speedLimit=" + getSpeedLimit() +
                ", hasToll=" + hasToll
                ;
    }
}