// package com.rushikesh.StackAndQueus.Stack;

public class Main {
    public static void main(String[] args) {

        DynamicStack stack = new DynamicStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.display();

        System.out.println(stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();

        stack.display();
        System.out.println(stack.size());


    }
}
