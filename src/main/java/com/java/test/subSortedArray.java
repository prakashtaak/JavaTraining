package com.java.test;

public class subSortedArray {

    public static void main(String[] args) {

            int[] intArray = {1, 5, 8, 10, 4,5,6, 7, 12, 15};

        int startSubIndex = -1;
        int j = intArray.length - 1;
        boolean foundStart = false;
        int p = 0;

        for (int i = 0; i < intArray.length; i++) {

            if(p<=j) {
                if (intArray[p] <= intArray[j]) {

                    p++;
                    j--;
                }else if (intArray[p] >= intArray[j]) {
                    p++;
                }


            }else break;



           /* if (!foundStart) {
                if (intArray[i] <= intArray[i + 1]) {
                    continue;
                } else {
                    foundStart = true;
                    startSubIndex = i + 1;
                }
            }
            if (foundStart) {
                if(intArray[j] > intArray[startSubIndex]){
                    j--;
                    continue;
                }
                else{

                }
            }*/


        }

        System.out.println("start index : "+p +" end index "+j );
    }
}
