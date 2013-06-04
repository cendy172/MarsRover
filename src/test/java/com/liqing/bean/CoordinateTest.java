package com.liqing.bean;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CoordinateTest {

    private Coordinate coordinate;

    @Before
    public void setUp() throws Exception {
        coordinate = new Coordinate(3, 4);
    }

    @Test
    public void shouldGenerateACoordinate() throws Exception {
        assertThat(coordinate.getX(), is(3));
        assertThat(coordinate.getY(), is(4));
    }

    @Test
    public void shouldIncreaseX() throws Exception {
        coordinate.increaseX();
        assertThat(coordinate.getX(), is(4));
    }

    @Test
    public void shouldDecreaseX() throws Exception {
        coordinate.decreaseX();
        assertThat(coordinate.getX(), is(3));
    }

    @Test
    public void shouldIncreaseY() throws Exception {
        coordinate.increaseY();
        assertThat(coordinate.getY(), is(5));
    }

    @Test
    public void shouldDecreaseY() throws Exception {
        coordinate.decreaseY();
        assertThat(coordinate.getY(), is(4));
    }
}
