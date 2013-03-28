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
        Rover rover = new Rover(3, 4, RoverAspect.NORTH);
        assertThat(rover.display(), is("3 4 N"));
    }

    @Test
    public void shouldTurnRight() throws Exception {
        Rover rover= new Rover(3, 4, RoverAspect.NORTH);
        rover.turnRight();
        assertThat(rover.display(),is("3 4 E"));
        rover.turnRight();
        assertThat(rover.display(),is("3 4 S"));
        rover.turnRight();
        assertThat(rover.display(),is("3 4 W"));
        rover.turnRight();
        assertThat(rover.display(),is("3 4 N"));
    }

    @Test
    public void shouldTurnLeft() throws Exception {
        Rover rover= new Rover(3, 4, RoverAspect.NORTH);
        rover.turnLeft();
        assertThat(rover.display(),is("3 4 W"));
        rover.turnLeft();
        assertThat(rover.display(),is("3 4 S"));
        rover.turnLeft();
        assertThat(rover.display(),is("3 4 E"));
        rover.turnLeft();
        assertThat(rover.display(),is("3 4 N"));
    }

    @Test
    public void shouldGoAhead() throws Exception {
        Rover rover = new Rover(3, 4, RoverAspect.NORTH);
        rover.goAhead();
        assertThat(rover.display(),is("3 5 N"));

        rover.turnRight();
        rover.goAhead();
        assertThat(rover.display(),is("4 5 E"));

        rover.turnRight();
        rover.goAhead();
        assertThat(rover.display(),is("4 4 S"));

        rover.turnRight();
        rover.goAhead();
        assertThat(rover.display(),is("3 4 W"));
    }
}
