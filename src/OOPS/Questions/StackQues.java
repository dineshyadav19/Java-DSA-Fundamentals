package OOPS.Questions;

import OOPS.DynamicStackQueue.DynamicStack;
import OOPS.Stack.Stack;

public class StackQues {
    public static void main(String[] args) throws Exception{
        DynamicStack stack = new DynamicStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.display();

        displayReverse(stack);
        System.out.println();

        stack.display();

        System.out.println("-----------Actual Reverse--------");

        actualReverse(stack, new DynamicStack());

        stack.display();


    }

    public static void displayReverse(DynamicStack stack) throws Exception{
        if(stack.isEmpty()) {
            return;
        }

        int temp = stack.pop();
        displayReverse(stack);
        System.out.println(temp + " ");

        stack.push(temp);

    }

    /*
    * Pop from original stack and push to helper stack
    * and when the original stack has become empty
    * now you have the data reversed in helper stack,
    * and we want to copy the data in the same form from helper to original stack
    * so, we'll keep on popping and storing it to temp
    * while returning from the base case we'll start pushing in to our original stack
    * */
    public static void actualReverse(DynamicStack stack, DynamicStack helper) throws Exception {
        if(stack.isEmpty()) {
            copyFromHelper(stack, helper);
            return;
        }

        int temp = stack.pop();
        helper.push(temp);

        actualReverse(stack, helper);
    }


    public static void copyFromHelper(DynamicStack stack, DynamicStack helper) throws Exception {
        if(helper.isEmpty())
            return;

        int temp = helper.pop();
        copyFromHelper(stack, helper);

        stack.push(temp);
    }
}
