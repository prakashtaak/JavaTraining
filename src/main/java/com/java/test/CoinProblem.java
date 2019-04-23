package com.java.test;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CoinProblem {

    static int combo(int[] coins, int m, int amount) {


        if (amount == 0) return 1;
        if (amount < 0) return 0;
        if (m < 0) return 0;

        return combo(coins, m - 1, amount) + combo(coins, m, amount - coins[m]);
    }

    static int combo1(int[] coins, int m, int amount) {
        if (amount == 0) return 1;
        if (amount < 0) return 0;
        int res =0;
        for(int i=m;i< coins.length;i++){

            res += combo1(coins,m,amount - coins[i]);
        }
                return res;

    }
    public static void main(String[] args) {
        int[] coins = {1,5};
        System.out.println(combo(coins,1,5));
    }


}
