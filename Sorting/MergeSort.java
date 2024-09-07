// package com.rushikesh.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int[] arr = {223,1,9,34,16,8,12,43};

        System.out.println(Arrays.toString(mergesort(arr)));

    }

    static int[] mergesort(int[] arr){

        if (arr.length == 1)    return arr;

        int m = arr.length / 2;

        int[] left = mergesort(Arrays.copyOfRange(arr, 0, m));
        int[] right = mergesort(Arrays.copyOfRange(arr, m, arr.length));

        return merge(left, right);

    }

    static int[] merge(int[] left, int[] right){

        int[] mix = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length){

            if (left[i] < right[j]){
                mix[k] = left[i];
                i++;
            }
            else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length){
            mix[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length){
            mix[k] = right[j];
            j++;
            k++;
        }

        return mix;
    }


}
