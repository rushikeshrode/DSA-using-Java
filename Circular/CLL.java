package com.rushikesh.LL.Circular;

public class CLL {

    Node head;
    Node tail;
    int size;

    public CLL(){
        this.head = null;
        this.tail = null;
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

    /*-----------------------------------------------------------------------*/

    public void insert(int val){

        Node node = new Node(val);

        if (head == null){
            head = node;
            tail = node;
            size++;
            return;
        }

        node.next = head;
        node.prev = tail;
        tail.next = node;
        tail = node;
        size++;

    }

    public void display(){

        Node dummyHead = head;

        System.out.println("--------------------------------------------");
        System.out.print("-♾- ");
        do{
            System.out.print(dummyHead.val +" 🔄 ");
            dummyHead = dummyHead.next;
        }while (dummyHead != head);

        System.out.println("-♾-");

//        Node dummyH = tail;
//
//        System.out.print("-♾- ");
//        do{
//            System.out.print(dummyH.val +" 🔄 ");
//            dummyH = dummyH.prev;
//        }while (dummyH != head);
//        System.out.print(dummyH.val);
//        System.out.println(" 🔄 -♾-");
        System.out.println("--------------------------------------------");

    }

    public void delete(int val){

        Node node = head;
        if (node == null) {
            return;
        }

        if (head == tail){
            System.out.println("Deleted : " + head.val);
            head = null;
            tail = null;
            size--;
            return;
        }

        if (node.val == val) {
            System.out.println("Deleted : " + node.val);
            head = head.next;
            tail.next = head;
            size--;
            return;
        }

        do {
            Node n = node.next;
            if (n.val == val) {
                System.out.println("Deleted : " + n.val);
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);


        size--;
    }



}
