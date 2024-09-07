// package com.rushikesh.LL.Doubly;

public class DLL {

    Node head;
    int size;

    public DLL(){
        this.size = 0;
    }

    public class Node{

        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;
        }
        public Node(int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

    }

    /*---------------------------------------------------------------*/

    public void insertFirst(int val){

        if (head == null){
            Node node = new Node(val);
            head = node;
            head.next = null;
            head.prev = null;
            size++;
            return;
        }

        Node node = new Node(val, head, null);
        head.prev = node;
        head = node;
        size++;

//        Node node = new Node(val);
//
//        node.next = head;
//        head.prev = node;
//        head = node;
//        size++;

    }

    public void display(){

        if (head == null)   return;

        Node dummy = head;

        System.out.println("-----------------------------------------------");

        System.out.print("H 🔄 ");
        while (dummy.next != null){
            System.out.print(dummy.val +" 🔄 ");
            dummy = dummy.next;
        }
        System.out.print(dummy.val +" 🔄 ");
        System.out.println("T 🔄 ");

        System.out.print("T 🔄 ");
        while (dummy != null){
            System.out.print(dummy.val +" 🔄 ");
            dummy = dummy.prev;
        }
        System.out.println("H 🔄 ");
        System.out.println("-----------------------------------------------");

    }

    public void insertLast(int val){

        if (head == null){
            Node node = new Node(val);
            head = node;
            head.next = null;
            head.prev = null;
            size++;
            return;
        }

        Node dummy = head;

        while (dummy.next != null){
            dummy = dummy.next;
        }

        Node node = new Node(val, dummy.next, dummy);
        dummy.next = node;
        size++;

    }

    public void insertAt(int pos, int val){

        if (pos == 0){
            insertFirst(val);
            return;
        }

        if (pos == size){
            insertLast(val);
            return;
        }

        Node temp = head;

        for (int i = 1; i < pos-1; i++) {
            temp = temp.next;
        }

        size++;
        Node node = new Node(val, temp.next, temp);
        temp.next = node;
        if (node.next != null) {
            node.next.prev = node;
        }

    }

    public void deleteFirst(){

        System.out.println("Deleted : "+  head.val);
        Node temp = head;
        head = head.next;
        head.prev = null;
        size--;

        temp = null;
    }

    public void deleteLast(){

        if (head == null){
            System.out.println("No item found");
            return;
        }
        if (head.next == null){
            System.out.println("Deleted Last : " + head.val);
            head = null;
            size--;
            return;
        }
        if (head.next.next == null){
            System.out.println("Deleted Last" + head.next.next.val);
            head.next = null;
            size--;
        }

        Node dummy = head;

        while (dummy.next.next != null){
            dummy = dummy.next;
        }

        System.out.println("Deleted Last : " + dummy.next.val);
        dummy.next = null;
        size--;

    }

    public void deleteItem(int val){

        if (head == null){
            System.out.println("No items found");
            return;
        }

        if (head.val == val){
            deleteFirst();
            return;
        }

        if (head.next.val == val){
            System.out.println("Deleted Last : " + head.next.val);
            head.next = head.next.next;
            size--;
            return;
        }

        Node dummy = head;

        while (dummy.next.val != val){
            dummy = dummy.next;
        }


//        System.out.println("dummy"+dummy.val);
        if (dummy.next.next != null){
            System.out.println("Deleted Item : "+dummy.next.val);
            dummy.next.next.prev = dummy;
            dummy.next = dummy.next.next;

        }
        else {
            System.out.println(dummy.next.val);
            dummy.next = null;
        }
        size--;
    }

}
