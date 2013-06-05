package com.liqing.main;

import com.liqing.action.Action;
import com.liqing.action.GoAheadAction;
import com.liqing.action.TurnLeftAction;
import com.liqing.action.TurnRightAction;
import com.liqing.bean.Rover;
import com.liqing.main.Command;

/**
 * User: Li Qing
 * Date: 13-3-28
 * Time: 下午11:08.
 */
public class CommandReceiver {

    private Action currentAction, leftAction, rightAction, goAheadAction;

    public CommandReceiver(Rover rover) {
        leftAction = new TurnLeftAction(rover);
        rightAction = new TurnRightAction(rover);
        goAheadAction = new GoAheadAction(rover);
    }

    public void handleCommand(String commandString) {
        char[] commands = commandString.toCharArray();
        for (char command : commands) {
            switch (command) {
                case Command.L:
                    currentAction = leftAction;
                    break;
                case Command.R:
                    currentAction = rightAction;
                    break;
                case Command.M:
                    currentAction = goAheadAction;
                    break;
                default:
                    break;
            }
            currentAction.excute();
        }

    }
}
