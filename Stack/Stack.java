// package com.rushikesh.StackAndQueus.Stack;

import java.util.ArrayList;

public class Stack {

    int[] data;
    int ptr = 0;

    static final int DEFAULT_SIZE = 5;

    public Stack(){
        this(DEFAULT_SIZE);
    }

    public Stack(int size){
        this.data = new int[size];
    }

/*------------------------------------------------------------------------*/

    public boolean isFull(){
        return data.length == ptr;
    }

    public boolean isEmpty(){
        return ptr == -1;
    }

    public int size(){
        return data.length;
    }

    public int peek(){
        return data[ptr-1];
    }
    public void push(int item){

        if (isFull()){
            System.out.println("Stack is full");
            return;
        }

        data[ptr++] = item;
    }

    public void display(){

        for (int i = 0; i < ptr; i++) {
            System.out.print(data[i] + " -> ");
        }
        System.out.println("End");
    }

    public int pop(){

        if (isEmpty()){
            System.out.println("Stack is empty!");
            return -1;
        }

        return data[--ptr];

    }

}
