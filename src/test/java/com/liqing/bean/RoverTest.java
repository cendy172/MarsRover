package com.liqing.bean;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * User: Li Qing
 * Date: 13-3-25
 * Time: 下午9:14.
 */
public class RoverTest{

    @Test
    public void shouldInitialANewRover() throws Exception {
        Rover rover = new Rover(3, 4, Rover.NORTH_ASPECT);
        assertThat(rover.getX(), is(3));
        assertThat(rover.getY(),is(4));
        assertThat(rover.getAspect(),is(Rover.NORTH_ASPECT));
    }

    @Test
    public void shouldMatchShortName() throws Exception {
        assertThat(Rover.EAST_ASPECT,is('E'));
        assertThat(Rover.WEAST_ASPECT,is('W'));
        assertThat(Rover.NORTH_ASPECT,is('N'));
        assertThat(Rover.SOUTH_ASPECT,is('S'));
    }

    @Test
    public void shouldTurnRight() throws Exception {
        Rover rover= new Rover(3, 4, Rover.NORTH_ASPECT);
        rover.turnRight();
        assertThat(rover.getAspect(),is(Rover.EAST_ASPECT));
        rover.turnRight();
        assertThat(rover.getAspect(),is(Rover.SOUTH_ASPECT));
        rover.turnRight();
        assertThat(rover.getAspect(),is(Rover.WEAST_ASPECT));
        rover.turnRight();
        assertThat(rover.getAspect(),is(Rover.NORTH_ASPECT));
    }

    @Test
    public void shouldTurnLeft() throws Exception {
        Rover rover= new Rover(3, 4, Rover.NORTH_ASPECT);
        rover.turnLeft();
        assertThat(rover.getAspect(),is(Rover.WEAST_ASPECT));
        rover.turnLeft();
        assertThat(rover.getAspect(),is(Rover.SOUTH_ASPECT));
        rover.turnLeft();
        assertThat(rover.getAspect(),is(Rover.EAST_ASPECT));
        rover.turnLeft();
        assertThat(rover.getAspect(),is(Rover.NORTH_ASPECT));
    }

    @Test
    public void shouldGoAhead() throws Exception {
        Rover rover = new Rover(3, 4, Rover.NORTH_ASPECT);
        rover.goAhead();
        assertThat(rover.getX(),is(3));
        assertThat(rover.getY(),is(5));
        assertThat(rover.getAspect(),is(Rover.NORTH_ASPECT));

        rover.turnRight();
        rover.goAhead();
        assertThat(rover.getX(),is(4));
        assertThat(rover.getY(),is(5));
        assertThat(rover.getAspect(),is(Rover.EAST_ASPECT));

        rover.turnRight();
        rover.goAhead();
        assertThat(rover.getX(),is(4));
        assertThat(rover.getY(),is(4));
        assertThat(rover.getAspect(),is(Rover.SOUTH_ASPECT));

        rover.turnRight();
        rover.goAhead();
        assertThat(rover.getX(),is(3));
        assertThat(rover.getY(),is(4));
        assertThat(rover.getAspect(),is(Rover.WEAST_ASPECT));

    }
}
