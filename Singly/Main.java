// package com.rushikesh.LL.Singly;

public class Main {
    public static void main(String[] args) {

        LL ls = new LL();

        ls.insertLast(12);
        ls.insertLast(7);
        ls.insertLast(2);
        ls.insertLast(3);
        ls.insertLast(43);
        ls.insertLast(89);
        ls.insertLast(6);
        ls.insert(6,5);
        ls.insertLast(34);
        ls.insert(2,54);
        ls.insert(4, 4);

        ls.display();

        ls.deleteFirst();
        ls.deleteLast();
        ls.delete(8);

        ls.display();

        ls.peek(5);

        System.out.println("size : "+ls.size);

        ls.peekFirst();
        ls.peekLast();

    }
}
