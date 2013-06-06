package com.liqing.action;

import com.liqing.bean.Coordinate;
import com.liqing.bean.Rover;
import com.liqing.bean.RoverAspect;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * User: Li Qing
 * Date: 13-3-28
 * Time: 下午11:05.
 */
public class TurnLeftActionTest {

    private Rover rover;

    @Before
    public void setUp() throws Exception {
        rover = new Rover(new Coordinate(3, 4), RoverAspect.NORTH);
    }

    @Test
    public void shouldTurnLeftWithAspect() throws Exception {
        Action command = new TurnLeftAction(rover);
        command.execute();
        assertThat(rover.display(), is("3 4 W"));
    }

}
