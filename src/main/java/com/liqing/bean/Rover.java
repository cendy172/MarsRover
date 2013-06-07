package com.liqing.bean;

/**
 * User: Li Qing
 * Date: 13-3-25
 * Time: 下午9:06
 */
public class Rover {

    private Coordinate coordinate;
    private RoverAspect aspect;

    private boolean alive;


    public Rover(Coordinate coordinate, RoverAspect aspect) {
        this.coordinate = coordinate;
        this.aspect = aspect;
        this.alive = true;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void die() {
        this.alive = false;
    }

    public void turnRight() {
        switch (this.aspect) {
            case EAST:
                this.aspect = RoverAspect.SOUTH;
                break;
            case SOUTH:
                this.aspect = RoverAspect.WEAST;
                break;
            case WEAST:
                this.aspect = RoverAspect.NORTH;
                break;
            case NORTH:
                this.aspect = RoverAspect.EAST;
                break;
        }
    }

    public void turnLeft() {
        switch (this.aspect) {
            case EAST:
                this.aspect = RoverAspect.NORTH;
                break;
            case SOUTH:
                this.aspect = RoverAspect.EAST;
                break;
            case WEAST:
                this.aspect = RoverAspect.SOUTH;
                break;
            case NORTH:
                this.aspect = RoverAspect.WEAST;
                break;
        }
    }

    public void goAhead() {
        switch (this.aspect) {
            case EAST:
                this.coordinate.increaseX();
                break;
            case WEAST:
                this.coordinate.decreaseX();
                break;
            case SOUTH:
                this.coordinate.decreaseY();
                break;
            case NORTH:
                this.coordinate.increaseY();
                break;
        }
    }

    public String display() {
        return new StringBuffer().append(this.coordinate.getX()).append(" ").append(this.coordinate.getY()).append(" ").append(this.aspect.toString()).toString();
    }

}
