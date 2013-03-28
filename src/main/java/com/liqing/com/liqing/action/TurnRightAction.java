package com.liqing.com.liqing.action;

import com.liqing.bean.Rover;

/**
 * User: Li Qing
 * Date: 13-3-28
 * Time: 下午10:37.
 */
public class TurnRightAction extends Action {
    private Rover rover;
    public TurnRightAction(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void excute() {
         this.rover.turnRight();
    }
}
