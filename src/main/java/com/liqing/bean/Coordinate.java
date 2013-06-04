package com.liqing.bean;

public class Coordinate {

    private int x;
    private int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void increaseX() {
        this.x++;
    }

    public void decreaseX() {
        this.x--;
    }

    public void increaseY() {
        this.y++;
    }

    public void decreaseY() {
        this.y--;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}
