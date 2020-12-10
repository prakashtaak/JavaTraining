package com.java.test;

public class StringPermutation {

    static void computeStringPermutation(String chars, int a) {

        if (a == chars.length()) System.out.println(chars);
        for (int i = a; i < chars.length(); i++) {

            if (i != a)
                chars = swap(chars, i, a);
            computeStringPermutation(chars, (a + 1));
            if (i != a)
                chars = swap(chars, i, a);

        }


    }

    static private String swap(String chars, int i, int b) {
        char[] tempChars = chars.toCharArray();
        char temp = tempChars[i];
        tempChars[i] = tempChars[b];
        tempChars[b] = temp;
        return String.valueOf(tempChars);

    }

    public static void main(String[] args) {


        computeStringPermutation("abcd", 0);
    }
}
