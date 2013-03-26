package com.liqing.bean;

/**
 * User: Li Qing
 * Date: 13-3-25
 * Time: 下午9:06
 */
public class Rover {

    public static final char EAST_ASPECT='E';
    public static final char WEAST_ASPECT='W';
    public static final char NORTH_ASPECT='N';
    public static final char SOUTH_ASPECT='S';

    private int x;
    private int y;
    private char aspect;

    public Rover(int x, int y, char aspect) {
        this.x = x;
        this.y = y;
        this.aspect = aspect;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public char getAspect() {
        return aspect;
    }

    public void turnRight() {
        switch (this.getAspect()){
            case EAST_ASPECT:
                this.aspect = SOUTH_ASPECT;
                break;
            case SOUTH_ASPECT:
                this.aspect = WEAST_ASPECT;
                break;
            case WEAST_ASPECT:
                this.aspect = NORTH_ASPECT;
                break;
            case NORTH_ASPECT:
                this.aspect = EAST_ASPECT;
                break;
        }
    }

    public void turnLeft() {
        switch (this.getAspect()){
            case EAST_ASPECT:
                this.aspect = NORTH_ASPECT;
                break;
            case SOUTH_ASPECT:
                this.aspect = EAST_ASPECT;
                break;
            case WEAST_ASPECT:
                this.aspect = SOUTH_ASPECT;
                break;
            case NORTH_ASPECT:
                this.aspect = WEAST_ASPECT;
                break;
        }
    }

    public void goAhead() {
        switch (this.getAspect()){
            case EAST_ASPECT:
                this.x += 1;
                break;
            case WEAST_ASPECT:
                this.x -= 1;
                break;
            case SOUTH_ASPECT:
                this.y -= 1;
                break;
            case NORTH_ASPECT:
                this.y += 1;
                break;
        }
    }
}
