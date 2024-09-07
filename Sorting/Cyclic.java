// package com.rushikesh.Sorting;

import java.util.Arrays;

public class Cyclic {
    public static void main(String[] args) {

        int[] arr = {0,5,4,6,3,2,1};

        cyclic(arr);

        System.out.println(Arrays.toString(arr));

    }

    static void cyclic(int[] arr){

        int i = 0;

        while (i < arr.length){

            int correct = arr[i];

            if (arr[i] != arr[correct]){
                int t = arr[i];
                arr[i] = arr[correct];
                arr[correct] = t;
            }else{
                i++;
            }

        }

    }
}
