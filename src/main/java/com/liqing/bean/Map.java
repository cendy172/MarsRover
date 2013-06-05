package com.liqing.bean;

import java.util.ArrayList;
import java.util.List;

public class Map {
    private int upperEdge;
    private int lowerEdge;
    private int leftEdge;
    private int rightEdge;
    private List<Coordinate> beacons;

    public Map(int length, int width) {
        this.leftEdge = 0;
        this.rightEdge = length;
        this.upperEdge = width;
        this.lowerEdge = 0;
        this.beacons = new ArrayList<Coordinate>();
    }


    public Boolean isOutOfMap(Coordinate coordinate) {
        return this.isOutOf(coordinate);
    }

    private boolean isOutOf(Coordinate coordinate) {
        if (coordinate.getX() < leftEdge || coordinate.getX() > rightEdge || coordinate.getY() < lowerEdge || coordinate.getY() > upperEdge) {
            this.beacons.add(coordinate);
            return true;
        }
        return false;
    }

    public Boolean hasBeacon(Coordinate coordinate) {
        return beacons.contains(coordinate) ? true : false;
    }
}
