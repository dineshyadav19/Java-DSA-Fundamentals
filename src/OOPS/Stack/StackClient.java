package OOPS.Stack;

public class StackClient {
    public static void main(String[] args) throws Exception{
        Stack s1 = new Stack();

        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);

        s1.display();

        //s1.push(500); --> this line will throw an error that OOPS.Stack is full

        System.out.println(s1.peek());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        // System.out.println(s.pop());

        s1.display();
        s1.push(50);
        s1.display();

    }
}
