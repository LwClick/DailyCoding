package com.lwclick.entity;

/**
 * @author: LiuWei
 * @create: 2021/9/18 14:14
 * @className: Player
 * @description:
 */
public abstract class Player {
    private String name;
    private int value;
    private int winCount = 0;

    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getWinCount() {
        return winCount;
    }

    public void setWinCount(int winCount) {
        this.winCount = winCount;
    }

    /**
     * 根据输入的值获取石头、剪刀、布
     * @return
     */
    public abstract int getInputValue();
}
