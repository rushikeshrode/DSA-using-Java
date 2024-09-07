// package com.rushikesh.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int[] arr = {223,1,9,34,16,8,12,43};

        quicksort(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));

    }

    static void quicksort(int[] arr, int low, int hi){

        if (low >= hi)  return;

        int s = low;
        int e = hi;
        int m = s + (e - s) / 2;
        int p = arr[m];

        while (s <= e){

            while (arr[s] < p){
                s++;
            }

            while (arr[e] > p){
                e--;
            }

            if (s <= e){

                int t = arr[s];
                arr[s] = arr[e];
                arr[e] = t;

                s++;
                e--;

            }
        }

        quicksort(arr, low, e);
        quicksort(arr, s, hi);


    }

}
