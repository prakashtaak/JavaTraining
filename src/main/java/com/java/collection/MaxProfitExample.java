package com.java.collection;

public class MaxProfitExample {

    public static void main(String[] args) {
        int[] arr= {12,20,5,30,6,40};
        int i=0,max_profit=Integer.MIN_VALUE,n=arr.length;
        int min_buy_v = Integer.MAX_VALUE;
        while(i < n){


            if(min_buy_v < arr[i]){

                int profit= arr[i] - min_buy_v;
                if(profit > max_profit){
                    max_profit =profit;
                }

            }else{
                min_buy_v =arr[i];

            }
            i++;

        }
    System.out.println(max_profit);
    }


}
