// package com.rushikesh.StackAndQueus.Queus;

public class Queus {

    int[] data;
    int ptr = 0;

    static final int DSIZE = 5;

    public Queus(){
        this(DSIZE);
    }

    public Queus(int size){
        data = new int[size];
    }

/////////////////////////////////////////////////////////////////////////

    public boolean isFull(){
        return data.length == ptr;
    }
    public boolean isEmpty(){
        return ptr == -1;
    }

    public int size(){
        return data.length;
    }
    public void push(int item){

        if (isFull()){
            System.out.println("Queus is full");
            return;
        }
        data[ptr++] = item;

    }

    public void display(){

        if (isEmpty()){
            System.out.println("Queus is empty !");
            return;
        }

        for (int i = 0; i < ptr; i++) {
            System.out.print(data[i] + " -> ");
        }

        System.out.println("⛔");
    }

    public int pop(){

        if (isEmpty()){
            System.out.println("Queus is empty !");
            return -1;
        }

        int temp = data[0];

        for (int i = 0; i < ptr-1; i++) {
            data[i] = data[i+1];
        }

        ptr--;

        return temp;
    }


}
