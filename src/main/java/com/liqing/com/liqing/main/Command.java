package com.liqing.com.liqing.main;

/**
 * User: Li Qing
 * Date: 13-3-28
 * Time: 下午11:11.
 */
public enum Command {
    L('L'),R('R'),M('M');

    private char value;
    Command(char value){
        this.value = value;
    }

    public char getValue(){
        return this.value;
    }
}
