package LinkedList;

public class LinkedList {

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

        Node() {

        }
    }

    private Node head ;

    //display the LinkedList
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    //Get size of LL
    public int size() {
        int count = 0;

        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    //check if LL is empty
    public boolean isEmpty() {
         return head == null;
    }

    //get first of LL
    public int getFirst() throws Exception{
        if(isEmpty()) {
            throw new Exception("LL is empty");
        }
        return head.data;
    }

    //get last
    public int getLast() {
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        return temp.data;
    }

    //get data at index
    public int getAt(int idx) throws Exception{
        if(isEmpty()) {
            throw new Exception("LL is empty");
        }

        if(idx < 0 || idx > size() - 1) {
            throw new Exception("Invalid Index");
        }

        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }

        return temp.data;
    }


    //get node at a particular index
    private Node getNodeAt(int idx) throws Exception{
        if(isEmpty()) {
            throw new Exception("LL is empty");
        }

        if(idx < 0 || idx >= size()) {
            throw new Exception("Invalid Index");
        }

        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }

        return temp;
    }

    //add last to Ll
    public void addLast(int data) throws Exception {
        Node nn = new Node(); //nn --> new node

        nn.data = data;
        nn.next = null;

        if (isEmpty()) {

            // your ll was already empty, now you are adding an element for the 1st time
            // special case
            head = nn;

        } else {

            // linking
            Node last = getNodeAt(size() - 1);
            last.next = nn;

        }
    }

    //add first to LL
    public void addFirst(int item) throws Exception{

        //create a new node
        Node nn = new Node();
        nn.data = item;
        nn.next = null;

        //link the new node to the head
        nn.next = head;
        head = nn;
    }

    //add at a particular index
    public void addAt(int idx, int item) throws Exception {

        if (idx < 0 || idx > size()) {
            throw new Exception("Invalid Index.");
        }

        if (idx == 0)
            addFirst(item);

        else if (idx == size())
            addLast(item);

        else {

            // create a new node
            Node nn = new Node();
            nn.data = item;
            nn.next = null;

            // linking
            Node n1 = getNodeAt(idx - 1);
            Node n2 = getNodeAt(idx);

            n1.next = nn;
            nn.next = n2;

        }

    }

    //remove last from LL
    public int removeLast() throws Exception{

        if(isEmpty()) {
            throw new Exception("List is Empty");
        }

        int temp = getLast();

        if(size() == 1) {
            head = null;
        } else {
            Node ln = getNodeAt(size() - 2);
            ln.next = null;
        }

        return temp;
    }

    //remove first from LL
    public int removeFirst() throws Exception {
        if (isEmpty()){
            throw new Exception("List is Empty");
        }

        int temp = getFirst();

        if(size() == 1) {
            head = null;
        } else {
            Node fn = getNodeAt(0);
            head = fn.next;
            fn.next = null;
        }

        return temp;
    }

    //remove at a particular index
    public int removeAt(int idx) throws Exception {

        if(isEmpty()) {
            throw new Exception("LL is empty");
        }

        if(idx < 0 || idx >= size()) {
            throw new Exception("Invalid Index");
        }

        if(idx == 0)
            return removeFirst();
        else if(idx == size() - 1)
            return removeLast();
        else {
            Node n1 = getNodeAt(idx - 1); //node prev to the node which has to be removed
            Node n2 = n1.next; //node which is to be removed
            Node n3 = n2.next; //node which has to link to the prev node

            n1.next = n3; //linking of node

            return n2.data;
        }

    }

    //Linked list reverse iteratively
    public void reverse() {
        Node temp = head; //temp is the previous node to the current node
        Node current = temp.next; //current node which has to be linked back with previous

        while (current != null) {
            Node ahead = current.next; //storing next node's address so that reference doesn't get lost somewhere
            current.next = temp; //linking

            temp = current; //moving
            current = ahead;
        }

        head.next = null; //updating head to avoid infinite loop
        head = temp; //setting last node as head
    }

    //Linked list reverse using recursion
    private void reverseRecursion(Node previous, Node current) {
        //base case
        if(current == null) {
            head = previous;
            return;
        }

        reverseRecursion(current, current.next);
        current.next = previous;
    }

    /*
    * Why we did this?
    * This is called abstraction.
    * When we want to call a function where we are passing some parameters which
    * are private and don't want the client to get access of it. then we create another public function
    * where we'll call that private function with private variables/parameters and functions
    * and then the client can get access to that public function only.
    * */
    public void reverseRecursion() {
        reverseRecursion(null, head);
    }

    //LinkedList Reverse while going deep into the recursion
    private void reverseDeepRecursion(Node prev, Node curr) {
        //base case
        if(curr == null){
            return;
        }

        Node ahead = curr.next;
        curr.next = prev;

        reverseDeepRecursion(curr, ahead);

    }

    //Linked List reverse using single variable
    private void reverseSingle(Node curr) {
        //base case
        if(curr.next == null) {
            head = curr;
            return;
        }

        reverseSingle(curr.next);
        curr.next.next = curr;
    }

    public void reverseR() {
        Node temp = head;
        reverseSingle(head);
        temp.next = null;
    }

    //find the middle node data
    public int mid() {
        Node slow = head;
        Node fast = head;

        //fast != null -> this condition should come first otherwise it'll throw null pointer exception
        //because if fast reaches null, and it'll do fast.next
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

    //find the kth element from last
    public int kLastElement(int k) {
        Node slow = head;
        Node fast = head;

        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow.data;
    }

    public void createList() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);
        Node n9 = new Node(9);
        Node n10 = new Node(10);
        Node n11 = new Node(11);
        Node n12 = new Node(12);
        Node n13 = new Node(13);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = n9;
        n9.next = n10;
        n10.next = null;

        n13.next = n12;
        n12.next = n11;
        n11.next = n4;

        System.out.println(intersection(n1, n13));
    }

    //find the intersection of two LL
    public int intersection(Node h1, Node h2) {

        Node fp = h1;
        Node sp = h2;

        while (fp != sp) {

            if (fp == null)
                fp = h2;
            else
                fp = fp.next;

            if (sp == null)
                sp = h1;
            else
                sp = sp.next;

        }

        return fp.data ;

    }

}
