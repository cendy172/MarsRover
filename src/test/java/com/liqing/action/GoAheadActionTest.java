package com.liqing.action;

import com.liqing.bean.Coordinate;
import com.liqing.bean.Map;
import com.liqing.bean.Rover;
import com.liqing.bean.RoverAspect;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

/**
 * User: Li Qing
 * Date: 13-3-28
 * Time: 下午11:01.
 */
public class GoAheadActionTest {

    private Rover rover;
    private Action command;
    private Map map;
    private Coordinate coordinate;

    @Before
    public void setUp() throws Exception {
        map = mock(Map.class);
        rover = mock(Rover.class);
        coordinate = mock(Coordinate.class);
        doReturn(coordinate).when(rover).getCoordinate();
        command = new GoAheadAction(map, rover);
    }

    @Test
    public void shouldGoAheadWithAspectWhenAlive() throws Exception {
        command.execute();
        successfullyInvoke(0, 0, 1);
    }

    private void successfullyInvoke(int turnLeftTimes, int turnRightTimes, int goAheadTimes) {
        verify(rover, times(turnLeftTimes)).turnLeft();
        verify(rover, times(turnRightTimes)).turnRight();
        verify(rover, times(goAheadTimes)).goAhead();
    }

    @Test
    public void shouldNotGoAheadWhenMeetBeacon() throws Exception {
        doReturn(coordinate).when(rover).getCoordinate();
        doReturn(true).when(map).hasBeacon(coordinate);
        command.execute();
        successfullyInvoke(0, 0, 1);
    }

    @Test
    public void shouldStayWhenMeetBeacon() throws Exception {
        map = new Map(3, 4);
        rover = new Rover(new Coordinate(3, 4), RoverAspect.EAST);
        map.isOutOfMap(new Coordinate(4, 4));
        command = new GoAheadAction(map, rover);
        command.execute();
        assertThat(rover.display(), is("3 4 E"));
    }

    @Test
    public void shouldBeABeaconWhenOutOfMap() throws Exception {
        doReturn(coordinate).when(rover).getCoordinate();
        doReturn(true).when(map).isOutOfMap(coordinate);
        doReturn(false).when(map).hasBeacon(coordinate);
        command.execute();
        verify(rover).die();
        assertThat(rover.isAlive(), is(false));
    }
}
