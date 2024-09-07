// package com.rushikesh.Heap;

import java.util.ArrayList;
import java.util.List;

public class Heap<T extends Comparable<T>> {

    ArrayList<T> list;
    public Heap(){
        list = new ArrayList<>();
    }

    public void swap(int f, int s){
        T t = list.get(f);
        list.set(f, list.get(s));
        list.set(s, t);
    }

    public int parent(int index){
        return (index - 1) / 2;
    }
    public int right(int index){
        return (index + 1) * 2;
    }
    public int left(int index){
        return (index * 2) + 1;
    }

    ///////////////////////////////////////////////////////////////////

    public void push(T item){

        list.add(item);
        upheap(list.size()-1);

    }

    public void upheap(int index){

        if (index == 0)     return;

        int p = parent(index);

        if (list.get(index).compareTo(list.get(p)) < 0){
            swap(index, p);
            upheap(p);
        }

    }

    public T pop() throws HeapException{

        if (list.isEmpty()){
            throw new HeapException("Heap is Empty!");
        }

        T f = list.getFirst();
        T l = list.removeLast();

        if (!list.isEmpty()){
            list.set(0, l);
        }

        downheap(0);

        return f;

    }

    public void downheap(int index){

        int min = index;
        int left = left(index);
        int right = right(index);

        while (left < list.size() && list.get(min).compareTo(list.get(left)) > 0){
            min = left;
        }

        while (right < list.size() && list.get(min).compareTo(list.get(right)) > 0){
            min = right;
        }

        if (min != index){
            swap(min, index);
            downheap(min);
        }
    }

    public ArrayList<T> display() throws HeapException{

        ArrayList<T> data = new ArrayList<>();

        for(T t : list){
            data.add(t);
        }

        return data;

    }

    public ArrayList<T> heapsort() throws HeapException{

        ArrayList<T> data = new ArrayList<>();

        while (!list.isEmpty()){
            data.add(this.pop());
        }

        return data;
    }


}
