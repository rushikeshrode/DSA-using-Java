// package com.rushikesh.Heap;

public class Main {
    public static void main(String[] args) throws HeapException {

        Heap heap = new Heap<>();

        heap.push(132);
        heap.push(1);
        heap.push(3);
        heap.push(5);
        heap.push(0);
        heap.push(13);


        System.out.println(heap.display());
        System.out.println(heap.heapsort());

        System.out.println(heap.pop());
        System.out.println(heap.pop());
        System.out.println(heap.pop());
        System.out.println(heap.pop());
        System.out.println(heap.pop());
        System.out.println(heap.pop());

//        System.out.println(heap.heapsort());



    }
}
