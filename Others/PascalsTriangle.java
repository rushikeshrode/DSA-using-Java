// package com.rushikesh.Others;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {

//        System.out.println(item(8,4));
//
//        List<Integer> row = entirerow(8);
//
//        System.out.println(row);

        pascals(8);


    }

    static int item(int row, int col){

        int ans = 1;

        for (int i = 0; i < col; i++) {
            ans *= row - i;
            ans /= i + 1;
        }
        return ans;
    }

    static List<Integer> entirerow(int row){

        List<Integer> ls = new ArrayList<>();

        for (int i = 0; i <= row; i++) {
            ls.add(item(row, i));
        }

        return ls;
    }

    static void pascals(int row){

        List<List<Integer>> ls = new ArrayList<>();

        for (int i = 0; i <= row; i++) {
            ls.add(entirerow(i));
        }

        for(List<Integer> list : ls){
            System.out.println(list);
        }

    }
}
