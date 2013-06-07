package com.liqing.action;

import com.liqing.bean.Coordinate;
import com.liqing.bean.Map;
import com.liqing.bean.Rover;

/**
 * User: Li Qing
 * Date: 13-3-28
 * Time: 下午10:37.
 */
public class GoAheadAction extends Action {
    private Map map;
    private Rover rover;
    private Coordinate currentCoordinate;

    public GoAheadAction(Map map, Rover rover) {
        this.map = map;
        this.rover = rover;
        currentCoordinate = this.rover.getCoordinate();
    }

    @Override
    public void execute() {
        Coordinate preCoordinate = new Coordinate(this.currentCoordinate.getX(), this.currentCoordinate.getY());
        rover.goAhead();
        if (map.hasBeacon(currentCoordinate)) {
            this.rover.setCoordinate(preCoordinate);
        }
        if (map.isOutOfMap(currentCoordinate)) {
            this.rover.die();
        }
    }
}
