package com.java.collection;

public class LongestPalindromicString {


    public static void main(String[] args) {

        String str="abcd";
        int n=str.length();
        boolean table[][] =new boolean[n][n];

        for(int i=0;i<n;i++){
            table[i][i]=true;
        }
        int startIndex=0;
        int maxLength=1;
        //palindromic string of length 2
        for(int i=0;i<n-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                startIndex=i;
                maxLength=2;
                table[i][i+1]=true;
            }
        }
        //palindromic string of length 3 or greater is found using below code
        for(int i=3;i<=n;i++){
            for(int j=0;j<n-i+1;j++){
                int k= j+i-1;
                if(str.charAt(j)==str.charAt(k) && table[j+1][k-1]){
                    table[j][k]=true;
                    startIndex=j;
                    maxLength=i;
                }
            }
        }

        System.out.println("length"+ maxLength);
        System.out.println("palendromic string"+ str.substring(startIndex,startIndex+maxLength));
    }
}
