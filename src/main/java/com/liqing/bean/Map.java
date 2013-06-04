package com.liqing.bean;

public class Map {
    private int upperEdge;
    private int lowerEdge;
    private int leftEdge;
    private int rightEdge;

    public Map(int length, int width) {
        this.leftEdge = 0;
        this.rightEdge = length;
        this.upperEdge = width;
        this.lowerEdge = 0;
    }


}
