package com.liqing.bean;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class MapTest {

    private Map map;
    private Rover rover;

    @Before
    public void setUp() throws Exception {
        map = new Map(4, 5);
        rover = new Rover(new Coordinate(3, 4), RoverAspect.EAST);
    }

    @Test
    public void shouldGenerateAMap() throws Exception {
        assertNotNull(map);
    }

    @Test
    public void shouldReturnFalseIfInMap() throws Exception {
        assertThat(map.isOutOfMap(rover), is(false));
    }

    @Test
    public void shouldReturnTrueIfOutOfMap() throws Exception {
        rover.goAhead();
        assertThat(map.isOutOfMap(rover), is(true));
    }
}
