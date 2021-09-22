package OOPS.DynamicStackQueue;

import OOPS.Queue.Queue;

public class DynamicQueue extends Queue {
    @Override
    public void enqueue(int item) throws Exception {
        if(isFull()) {

            //if the array is full create a new array of double size
            int[] na = new int[data.length * 2];

            //copy the values
            for (int i = 0; i < size; i++) {
                int idx = (i + front) % data.length;
                na[i] = data[idx];
            }

            //change reference
            data = na;
            front = 0;
        }

        super.enqueue(item);
    }
}

class QClient {
    public static void main(String[] args) throws Exception{
        DynamicQueue q = new DynamicQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.display();

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

        q.display();

        q.enqueue(60);
        q.enqueue(70);

        q.display();

        q.enqueue(80);
        q.enqueue(90);

        q.display();
    }
}
