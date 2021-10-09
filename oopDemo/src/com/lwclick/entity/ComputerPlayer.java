package com.lwclick.entity;

import com.lwclick.utils.MyUtils;

/**
 * @author: LiuWei
 * @create: 2021/9/18 14:26
 * @className: ComputerPlayer
 * @description:
 */
public class ComputerPlayer extends Player{
    public ComputerPlayer() {
    }

    public ComputerPlayer(String name) {
        super(name);
    }

    @Override
    public int getInputValue() {
        int val = MyUtils.getRandom(0, 2);
        super.setValue(val);
        return val;
    }
}
