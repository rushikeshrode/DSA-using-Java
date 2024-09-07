// package com.rushikesh.LL.Doubly;

public class Main {
    public static void main(String[] args) {

        DLL ls = new DLL();

        ls.insertLast(12);
        ls.insertLast(2);
        ls.insertLast(4);

        ls.insertFirst(44);

        ls.insertAt(2,55);

        ls.insertAt(5, 8);

        ls.display();

        System.out.println(ls.size);

    }
}
