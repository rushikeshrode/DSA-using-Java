// package com.rushikesh.StackAndQueus.Stack;

public class DynamicStack extends Stack{

    public DynamicStack(){
        super();
    }
    public DynamicStack(int size){
        super();
    }

    @Override
    public void push(int item){
        if (this.isFull()){
            int[] newStack = new int[data.length * 2];

            for (int i = 0; i < data.length; i++) {
                newStack[i] = data[i];
            }

            data = newStack;
        }

        super.push(item);

    }

}
