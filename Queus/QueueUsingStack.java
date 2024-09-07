package com.rushikesh.StackAndQueus.Queus;

import java.util.Stack;

public class QueueUsingStack {

    static Stack<Integer> que = new Stack<>();

    static void push(int item){
        que.push(item);
    }

    static void display(){
        for(int i : que){
            System.out.print(i + " -> ");
        }
        System.out.println("END");
    }

    static void pop(){

        Stack<Integer> temp = new Stack<>();

        while (!que.isEmpty()){
            temp.push(que.pop());
        }

        System.out.println(temp.pop());

        while (!temp.isEmpty()){
            que.push(temp.pop());
        }

    }


    public static void main(String[] args) {

        QueueUsingStack que = new QueueUsingStack();

        que.push(12);
        que.push(2);
        que.push(5);
        que.push(7);

        que.display();

        que.pop();
        que.pop();

        que.display();

    }


}
