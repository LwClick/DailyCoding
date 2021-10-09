package com.lwclick.entity;

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
        try {
            System.out.print("玩家请出手（0-石头，1-剪刀，2-布）:  ");
            Scanner sc = new Scanner(System.in);
            int val = sc.nextInt();
            super.setValue(val);
            return val;
        } catch (Exception e) {
            System.err.println("请输入正确的数字！");
            return 0;
        }
    }
}
