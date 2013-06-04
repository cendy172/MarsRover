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
 * Time: 下午11:01.
 */
public class GoAheadActionTest {

    private Rover rover;

    @Before
    public void setUp() throws Exception {
        rover = new Rover(new Coordinate(3, 4), RoverAspect.NORTH);
    }

    @Test
    public void shouldGoAheadWithAspect() throws Exception {
        Action command = new GoAheadAction(rover);
        command.excute();
        assertThat(rover.display(), is("3 5 N"));
    }
}
