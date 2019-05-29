package com.java.collection;

public class CoinChange {

    public static void main(String[] args) {


        int coins[]={1,5,3};
        System.out.println(newCoinChange(coins,0,5));

    }

    static int countOfCoinChange(int[] coins,int coin,int sum){

        if(sum==0) return 1;
        if(sum < 0) return 0;
        int total=0;
        for(int i=coin;i<coins.length;i++){
            total +=countOfCoinChange(coins,i,sum-coins[i]);
        }
        return total;
    }

    static int newCoinChange(int[] coins,int coin,int sum){
        if(sum==0) return 1;
        if(sum < 0) return 0;
        if(coin >= coins.length)return 0;
        return newCoinChange(coins,coin,sum - coins[coin])  + newCoinChange(coins,coin+1,sum);
    }
}
