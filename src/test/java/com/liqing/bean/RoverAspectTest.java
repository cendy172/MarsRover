package com.liqing.bean;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * User: Li Qing
 * Date: 13-3-28
 * Time: 下午2:02.
 */
public class RoverAspectTest {

    @Test
    public void shouldMatchEnumAndValue() throws Exception {
        assertThat(RoverAspect.EAST.toString(), is("E"));
        assertThat(RoverAspect.WEAST.toString(), is("W"));
        assertThat(RoverAspect.NORTH.toString(), is("N"));
        assertThat(RoverAspect.SOUTH.toString(), is("S"));
    }
}
