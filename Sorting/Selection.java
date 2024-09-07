// package com.rushikesh.Sorting;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {

        int[] arr = {21,3,34,78,54,12,2,43,43};

        selectionsearch(arr);

        System.out.println(Arrays.toString(arr));

    }

    static void selectionsearch(int[] arr){

        for (int i = 0; i < arr.length; i++) {

            int last = arr.length - 1 - i;
            int max = findMax(arr, 0, last);

            swap(arr, last, max);

        }

    }

    static void swap(int[] arr, int f, int s){
        int t = arr[f];
        arr[f] = arr[s];
        arr[s] = t;
    }

    static int findMax(int[] arr, int s, int e){

        int max = s;

        for (int i = 0; i <= e; i++) {
            if (arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
}
