// package com.rushikesh.BinarySearch;

public class BS {
    public static void main(String[] args) {

        int[] arr = {1,2,4,5,7,9,12,15,88};
        int target = 88;

        System.out.println(bs(arr, target));

    }


    static int bs(int[] arr, int t){


        int s = 0;
        int e = arr.length-1;

        while (s <= e){

            int m = s + (e-s) / 2;

            if (arr[m] == t){
                System.out.print("found : @");
                return m;
            }

            if (arr[m] < t){
                s = m + 1;
            }

            if (arr[m] > t){
                e = m - 1;
            }

        }

        return -1;
    }
}
