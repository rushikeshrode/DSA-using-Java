// package com.rushikesh.StackAndQueus.Queus;

public class DynamicQueus extends Queus{

    public DynamicQueus(){
        super();
    }
    public DynamicQueus(int size){
        super();
    }

    @Override
    public void push(int item){

        if (this.isFull()){
            int[] temp = new int[data.length * 2];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        super.push(item);
    }


}
