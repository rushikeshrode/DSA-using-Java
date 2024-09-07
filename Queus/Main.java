package com.rushikesh.StackAndQueus.Queus;

public class Main {
    public static void main(String[] args) {

        DynamicQueus queus = new DynamicQueus(5);

        queus.push(1);
        queus.push(2);
        queus.push(3);
        queus.push(4);
        queus.push(5);
        queus.push(6);

        System.out.println("DynamicQueus size : " +queus.size());

        queus.display();

        System.out.println(queus.pop());
        System.out.println(queus.pop());

        queus.display();
    }
}
