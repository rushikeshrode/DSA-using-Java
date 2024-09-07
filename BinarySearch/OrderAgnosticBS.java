package com.rushikesh.BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {

        int[] arr1 = {1,2,4,5,7,9,12,15,88};
        int[] arr2 = {99, 87, 76, 54, 32, 12, 7, 2};

        int target = 32;

        System.out.println(oabs(arr2, target));

    }

    static int oabs(int[] arr, int t){

        int s = 0;
        int e = arr.length - 1;

        boolean isAsd = arr[s] <= arr[e];

        while (s <= e){

            int m = s + ( e - s ) / 2;

            if (arr[m] == t) {
                System.out.print("found at : ");
                return m;
            }

            if (isAsd){

                if (arr[m] < t)     s = m + 1;
                else                e = m - 1;

            }else{

                if (arr[m] < t)     e = m - 1;
                else                s = m + 1;

            }

        }
        return -1;
    }

}
