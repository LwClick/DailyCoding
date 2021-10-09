package com.lwclick.utils;

import java.util.Random;

/**
 * @author: LiuWei
 * @create: 2021/9/16 15:26
 * @className: MyUtils
 * @description:
 */
public class MyUtils {

    private MyUtils() {
    }

    /**
     * 获取从 min 到 max 的随机数
     * @param min
     * @param max
     * @return
     */
    public static int getRandom(int min, int max) {
        return new Random().nextInt(max - min + 1);
    }
}
