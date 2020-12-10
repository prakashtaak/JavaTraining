package com.java.collection;

public class MissingNumberInTwoSortedArray {

    static int findMissingNumber(int[] arr1,int[] arr2,int start,int endIndex) {

        if (start == endIndex) {
            if(arr1.length>arr2.length){
                return arr1[start];
            }else{
                return arr2[start];
            }
        }

        int mid = (start + endIndex) / 2;

        if (arr1[mid] == arr2[mid]) {
            return findMissingNumber(arr1, arr2, mid + 1, endIndex);
        } else  {
            return findMissingNumber(arr1, arr2, start, mid);

        }
    }

    public static void main(String[] args) {
        int arr1[]={2,4,6,8,13,15};
        int arr2[]={2,4,8,13,15};

        int n = Math.max(arr1.length,arr2.length);

        System.out.println(findMissingNumber(arr1,arr2,0,n-1));
    }
}
