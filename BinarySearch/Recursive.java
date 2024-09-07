// package com.rushikesh.BinarySearch;

public class Recursive {
    public static void main(String[] args) {

        int[] arr = {2,4,6,8,12,15,18,32};

        int t = 32;

        System.out.println(bs(arr, t, 0, arr.length-1));


    }

    static int bs(int[] arr, int t, int s, int e){

        if (s > e)  return -1;

        int m = s + (e-s) / 2;

        if (t == arr[m])    return m;

        if (t > arr[m])     return bs(arr, t, m+1, e);

        else                return bs(arr, t, s, m-1);

    }
}
