package com.liqing.bean;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class MapTest {

    private Map map;

    @Before
    public void setUp() throws Exception {
        map = new Map(4, 5);
    }

    @Test
    public void shouldGenerateAMap() throws Exception {
        assertNotNull(map);
    }
}
