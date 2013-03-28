package com.liqing.com.liqing.main;

import com.liqing.bean.Rover;
import com.liqing.com.liqing.action.Action;
import com.liqing.com.liqing.action.GoAheadAction;
import com.liqing.com.liqing.action.TurnLeftAction;
import com.liqing.com.liqing.action.TurnRightAction;

/**
 * User: Li Qing
 * Date: 13-3-28
 * Time: 下午11:08.
 */
public class CommandReceiver {

    private Action currentAction,leftAction,rightAction,goAheadAction;

    public CommandReceiver(Rover rover) {
        leftAction = new TurnLeftAction(rover);
        rightAction = new TurnRightAction(rover);
        goAheadAction = new GoAheadAction(rover);
    }

    public void handleCommand(String commandString){
        char[] commands = commandString.toCharArray();
        for(char command : commands){
            switch(command){
                //TODO remain some problem not resolve
//                case Command.L.getValue():
//                    currentAction = leftAction;
//                    break;
//                case Command.R.getValue():
//                    currentAction = rightAction;
//                    break;
//                case Command.M.getValue():
//                    currentAction = goAheadAction;
//                    break;
//                default:
//                    break;
            }
            currentAction.excute();
        }

    }
}
