
public class LL {

    Node head;
    int size;

    public LL(){
        this.size = 0;
    }

    public class Node{

        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }

    }

    public void insertFirst(int val){

        Node node = new Node(val);

        node.next = head;
        head = node;
        size++;


    }

    public void display(){

        Node dummy = head;

        if (dummy == null){
            return;
        }

        while (dummy != null){
            System.out.print(dummy.val +"->");
            dummy = dummy.next;
        }
        System.out.println("END");
    }

    public void insert(int pos, int val){

        Node dummyHead = head;

        if (pos == 0){
            insertFirst(val);
            return;
        }

        for (int i = 0; i < pos-1; i++) {
            dummyHead = dummyHead.next;
        }

        if (dummyHead.next == null) {
            insertLast(val);
            return;
        }

        Node node = new Node(val, dummyHead.next);
        dummyHead.next = node;
        size++;

    }

    public void insertLast(int val){

        Node dummyHead = head;

        if (dummyHead ==null){
            insertFirst(val);
            return;
        }

        while (dummyHead.next != null){
            dummyHead = dummyHead.next;
        }

        Node node = new Node(val);
        dummyHead.next = node;
        size++;
    }


    public void deleteFirst(){

        System.out.println(head.val);

        head = head.next;

        size--;

    }

    public void deleteLast(){

        Node dummy = head;

        if (dummy == null)  return;

        while (dummy.next.next != null){
            dummy = dummy.next;
        }

        System.out.println(dummy.next.val);
        dummy.next = null;
        size--;

    }

    public void delete(int pos){

        if (pos == 0){
            deleteFirst();
            return;
        }
        if (pos == size-1){
            deleteLast();
            return;
        }

        Node temp = head;

        for (int i = 0; i < pos-1; i++) {
            temp = temp.next;
        }

        System.out.println(temp.next.val);

        temp.next = temp.next.next;
        size--;

    }

    public void peek(int pos){

        Node temp = head;

        for (int i = 0; i < pos; i++) {
            temp = temp.next;
        }

        System.out.print("Val of "+pos+" : ");
        System.out.println(temp.val);

    }

    public void peekFirst(){
        System.out.print("Head : ");
        System.out.println(head.val);
    }

    public void peekLast(){

        Node temp = head;
        for (int i = 0; i < size-1; i++) {
            temp = temp.next;
        }
        System.out.print("Tail : ");
        System.out.println(temp.val);
    }



}
