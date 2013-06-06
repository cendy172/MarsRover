package com.liqing.main;

import com.liqing.bean.Map;
import com.liqing.bean.Rover;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
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
        commandReceiver.handleCommand("M");
        verify(rover).goAhead();
    }

    @Test
    public void shouldNotInvokeActionWhenRoverDead() throws Exception {
        doReturn(false).when(rover).isAlive();
        commandReceiver.handleCommand("M");
        verify(rover, times(0)).goAhead();
    }
}
