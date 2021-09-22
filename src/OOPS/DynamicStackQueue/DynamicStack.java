package OOPS.DynamicStackQueue;

import OOPS.Stack.Stack;

public class DynamicStack extends Stack {

    @Override
    public void push(int item) throws Exception{

        if(isFull()) {

            //If the stack is full, create a new one with double length
            int[] na = new int[data.length * 2];

            //copy the value of old array to new
            for (int i = tos; i >= 0 ; i--) {
                na[i] = data[i];
            }

            //change reference of data to na
            data = na;
        }

        super.push(item);
    }

}
