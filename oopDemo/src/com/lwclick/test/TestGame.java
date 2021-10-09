package com.lwclick.test;

import com.lwclick.service.GuessGame;

/**
 * @author: LiuWei
 * @create: 2021/9/23 16:43
 * @className: TestGame
 * @description:
 */
public class TestGame {
    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        game.initGame();
        game.startGame();
        game.endGame();
    }
}
