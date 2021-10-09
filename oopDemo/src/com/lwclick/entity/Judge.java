package com.lwclick.entity;

import com.lwclick.utils.Constants;

/**
 * @author: LiuWei
 * @create: 2021/9/18 14:29
 * @className: Judger
 * @description:
 */
public class Judge {

    public int judgeWin(int val1, int val2) {
        if (val1 == Constants.STONE) {
            if (val2 == Constants.SCISSORS) {
                return 1;
            } else if (val2 == Constants.STONE) {
                return 0;
            } else {
                return -1;
            }
        } else if (val1 == Constants.SCISSORS){
            if (val2 == Constants.SCISSORS) {
                return 0;
            } else if (val2 == Constants.STONE) {
                return -1;
            } else {
                return 1;
            }
        } else {
            if (val2 == Constants.SCISSORS) {
                return -1;
            } else if (val2 == Constants.STONE) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
