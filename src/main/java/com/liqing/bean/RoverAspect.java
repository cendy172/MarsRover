package com.liqing.bean;

/**
 * User: Li Qing
 * Date: 13-3-27
 * Time: 下午10:14.
 */
public enum RoverAspect {
    NORTH('N'), SOUTH('S'), EAST('E'), WEAST('W');

    private char aspect;

    RoverAspect(char aspect) {
        this.aspect = aspect;
    }

    public String toString() {
        return String.valueOf(this.aspect);
    }

}
