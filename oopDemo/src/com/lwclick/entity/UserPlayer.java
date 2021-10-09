package com.lwclick.entity;

import com.lwclick.utils.CheckNumberException;

import java.util.Scanner;

/**
 * @author: LiuWei
 * @create: 2021/9/18 14:16
 * @className: UserPlayer
 * @description:
 */
public class UserPlayer extends Player{
    public UserPlayer() {
    }

    public UserPlayer(String name) {
        super(name);
    }

    @Override
    public int getInputValue() {
        System.out.print("玩家请出手（0-石头，1-剪刀，2-布）:  ");
        int val = 0;
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            val = sc.nextInt();
        } else {
            throw new CheckNumberException("请输入数字");
        }
        super.setValue(val);
        return val;
    }
}
