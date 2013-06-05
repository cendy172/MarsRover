package com.liqing.bean;

/**
 * User: Li Qing
 * Date: 13-3-25
 * Time: 下午9:06
 */
public class Rover {

    public static final char EAST_ASPECT = 'E';
    public static final char WEAST_ASPECT = 'W';
    public static final char NORTH_ASPECT = 'N';
    public static final char SOUTH_ASPECT = 'S';

    private Coordinate coordinate;
    private RoverAspect aspect;

    public Rover(Coordinate coordinate, RoverAspect aspect) {
        this.coordinate = coordinate;
        this.aspect = aspect;
    }

    public Coordinate getCoordinate() {
        return coordinate;
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
