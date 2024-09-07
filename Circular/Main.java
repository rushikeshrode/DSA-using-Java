package com.rushikesh.LL.Circular;

public class Main {
    public static void main(String[] args) {

        CLL ls = new CLL();

        ls.insert(12);
//        ls.insert(2);
//        ls.insert(4);
        ls.insert(5);
        ls.insert(7);
        ls.insert(87);
        ls.insert(5);
        ls.insert(233);
        System.out.println("size : " + ls.size);

        ls.display();
        ls.delete(12);
        ls.delete(87);
//        ls.delete(4);

        ls.display();

        System.out.println("size : " + ls.size);

    }
}
