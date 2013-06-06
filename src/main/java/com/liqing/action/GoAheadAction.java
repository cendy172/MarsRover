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

    public GoAheadAction(Map map, Rover rover) {
        this.map = map;
        this.rover = rover;
    }

    @Override
    public void execute() {
        Coordinate coordinate = rover.getCoordinate();
        rover.goAhead();
        if (map.hasBeacon(rover.getCoordinate())) {
            this.rover.setCoordinate(coordinate);
        }
        if (map.isOutOfMap(rover.getCoordinate())) {
            this.rover.die();
        }
    }
}
