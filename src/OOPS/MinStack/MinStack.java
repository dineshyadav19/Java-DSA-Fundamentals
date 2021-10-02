package OOPS.MinStack;

import OOPS.DynamicStackQueue.DynamicStack;

public class MinStack extends DynamicStack {

    private int min;

    @Override
    public void push(int val) throws Exception {
        if(isEmpty()) {
            super.push(val);
            min = val;
        } else if(val >= min) {
            super.push(val);
        } else if(val < min) {
            super.push(2 * val - min);
            min = val;
        }
    }

    @Override
    public int peek() throws Exception {
        if(isEmpty()) {
            throw new Exception("Stack is Empty");
        }
        // no encryption
        else if(super.peek() > min) {
            return super.peek();
        }
        // encryption
        else {
            //(super.peek() < min)
            return min;
        }
    }

    @Override
    public int pop() throws Exception {
        if(isEmpty()) {
            throw new Exception("Stack is Empty");
        }
        // no encryption
        else if(super.peek() > min) {
            return super.pop();
        }
        // encryption
        else {
            int originalMin = min;
            int topMostElement = super.pop();
            min =  2 * min - topMostElement;

            return originalMin;
        }
    }

    public int min() throws Exception {

        if (isEmpty()) {
            throw new Exception("Stack is Empty.");
        }

        return min;
    }
}
