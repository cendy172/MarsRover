package com.liqing.main;

import com.liqing.action.Action;
import com.liqing.action.GoAheadAction;
import com.liqing.bean.Coordinate;
import com.liqing.bean.Map;
import com.liqing.bean.Rover;
import com.liqing.bean.RoverAspect;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.willReturn;
import static org.mockito.Mockito.*;


public class CommandReceiverTest {

    private Rover rover;
    private CommandReceiver commandReceiver;
    private Map map;

    @Before
    public void setUp() throws Exception {
        rover = mock(Rover.class);
        map = mock(Map.class);
        commandReceiver = new CommandReceiver(map, rover);
        doReturn(true).when(rover).isAlive();
    }

    @Test
    public void shouldInvokeTurnLeft() throws Exception {

        commandReceiver.handleCommand("L");
        verify(rover).turnLeft();
    }

    @Test
    public void shouldInvokeTurnRight() throws Exception {
        commandReceiver.handleCommand("R");
        verify(rover).turnRight();
    }

    @Test
    public void shouldInvokeGoAhead() throws Exception {
        map = new Map(4, 5);
        rover = new Rover(new Coordinate(3, 4), RoverAspect.EAST);
        commandReceiver = new CommandReceiver(map, rover);
        commandReceiver.handleCommand("M");
        assertThat(rover.display(), is("4 4 E"));
    }

    @Test
    public void shouldNotInvokeActionWhenRoverDead() throws Exception {
        doReturn(false).when(rover).isAlive();
        commandReceiver.handleCommand("M");
        verify(rover, times(0)).goAhead();
    }
}
