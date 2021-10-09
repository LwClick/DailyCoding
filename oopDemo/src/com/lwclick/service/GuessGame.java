package com.lwclick.service;

import com.lwclick.entity.ComputerPlayer;
import com.lwclick.entity.Judge;
import com.lwclick.entity.UserPlayer;
import com.lwclick.utils.Constants;

/**
 * @author: LiuWei
 * @create: 2021/9/18 14:38
 * @className: GuessGame
 * @description:
 */
public class GuessGame implements GameInterface{
    private UserPlayer userPlayer = null;
    private ComputerPlayer computerPlayer = null;
    private Judge judge = null;
    private int gameCount = 0;

    @Override
    public void initGame() {
        userPlayer = new UserPlayer("张三");
        computerPlayer = new ComputerPlayer("阿尔法狗");
        judge = new Judge();
        gameCount++;
    }

    @Override
    public void startGame() {
        while (true) {
            System.out.println("==========第" + gameCount + "局=============");
            int userVal = userPlayer.getInputValue();
            int computerVal = computerPlayer.getInputValue();
            System.out.println(userPlayer.getName() + ": " + Constants.NAMES[userVal] + "  VS  "
                    + Constants.NAMES[computerVal] + ": " + computerPlayer.getName());
            int judgeWin = judge.judgeWin(userVal, computerVal);
            modifyWinCount(judgeWin);
            printResult();
            if (userPlayer.getWinCount() == Constants.WIN_COUNT
                    || computerPlayer.getWinCount() == Constants.WIN_COUNT) {
                break;
            }
            gameCount++;
        }
    }

    private void printResult() {
        System.out.println("当前比分：" + userPlayer.getName() + userPlayer.getWinCount() + " : " + computerPlayer.getWinCount() + " " + computerPlayer.getName());
    }

    private void modifyWinCount(int judgeWin) {
        if (judgeWin == 1) {
            userPlayer.setWinCount(userPlayer.getWinCount() + 1);
            System.out.println(userPlayer.getName() + "获胜！");
        } else if (judgeWin == -1) {
            computerPlayer.setWinCount(computerPlayer.getWinCount() + 1);
            System.out.println(computerPlayer.getName() + "获胜！");
        } else {
            System.out.println("平局！");
        }
    }

    @Override
    public void endGame() {
        System.out.println("=================================");
        System.out.println("最终比分：" + userPlayer.getName() + userPlayer.getWinCount() + " : " + computerPlayer.getWinCount() + " " + computerPlayer.getName());
        if (userPlayer.getWinCount() > computerPlayer.getWinCount()) {
            System.out.println(userPlayer.getName() + "获得最终胜利！！！");
        } else {
            System.out.println(computerPlayer.getName() + "获得最终胜利！！！");
        }
    }
}
