// package com.rushikesh.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {21,3,34,54,78,54,122};

        bubble(arr);

        System.out.println(Arrays.toString(arr));

    }

    static void bubble(int[] arr){

        boolean swapped;

        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length-i; j++) {

                if (arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                    swapped = true;
                }
            }
            if (!swapped)   break;
        }
    }

    static void swap(int[] arr, int f, int s){
        int t = arr[f];
        arr[f] = arr[s];
        arr[s] = t;
    }
}
