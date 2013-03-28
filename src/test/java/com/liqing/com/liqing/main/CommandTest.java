package com.liqing.com.liqing.main;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * User: Li Qing
 * Date: 13-3-28
 * Time: 下午11:39.
 */
public class CommandTest {

    @Test
    public void shouldMatchEnumAndValue() throws Exception {
        assertThat(Command.L.getValue(),is('L'));
        assertThat(Command.R.getValue(),is('R'));
        assertThat(Command.M.getValue(),is('M'));
    }
}
