package com.liqing.action;

import com.liqing.bean.Rover;

/**
 * User: Li Qing
 * Date: 13-3-28
 * Time: 下午10:37.
 */
public class GoAheadAction extends Action {
    private Rover rover;

    public GoAheadAction(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void excute() {
        this.rover.goAhead();
    }
}
