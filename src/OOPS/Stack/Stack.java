package OOPS.Stack;

public class Stack {
    protected int[] data;
    protected int tos;

    public Stack() {
        data = new int[5];
        tos = -1;
    }

    public Stack(int cap) {
        data = new int[cap];
        tos = -1;
    }

    //One way of handling Exception is to pass exception from function to funtion
    public void push(int item) throws Exception{
        if(isFull()) {
            //Exception Generation
            throw new Exception("OOPS.Stack is Full. Delete some items to insert new.");
        }
        tos++;
        data[tos] = item;
    }

    public int pop() throws Exception{

        if(isEmpty()) {
            throw new Exception("OOPS.Stack is Empty. Can't delete now");
        }

        int temp = data[tos];
        data[tos] = 0;
        tos--;

        return temp;
    }

    public int peek() throws Exception{
        if (isEmpty()) {
            throw new Exception("OOPS.Stack is Empty.");
        }

        int temp = data[tos];
        return temp;
    }

    public int size() {
        return tos + 1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean isFull() {
        return size() == data.length;
    }

    public void display() {
        //do not make changes directly to toss
        for (int i = tos; i >= 0; i--) {
            System.out.println(data[i] + " ");
        }
        System.out.println();
    }

}
