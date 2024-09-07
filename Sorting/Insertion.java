// package com.rushikesh.Sorting;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        
        int[] arr = {21,3,34,78,54,12,2,43,43};

        insertion(arr);

        System.out.println(Arrays.toString(arr));
        
    }
    
    static void insertion(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {

            for (int j = i + 1; j > 0 ; j--) {

                if (arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
                else {
                    break;
                }
            }
        }
        
    }
    static void swap(int[] arr, int f, int s){
        int t = arr[f];
        arr[f] = arr[s];
        arr[s] = t;
    }
}
