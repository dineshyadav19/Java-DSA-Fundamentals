package OOPS.Questions;

import OOPS.DynamicStackQueue.DynamicStack;

import java.util.Arrays;
import java.util.Stack;

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

        System.out.println("-----------  Find Celeb  -----------");

        int[][] arr = {
                {0,1,1,1},
                {1,0,1,0},
                {0,0,0,0},
                {1,1,1,0}
        };

        findCelebrity(arr);

        System.out.println("-----------  Find Next Greater Element  -----------");

        int[] arr1 = {50,30,20,40,10,45,5,60,15,8};
        nextGreaterElement(arr1);

        int[] arr2 = {1,2,1};
        int[] ans = nextGreaterElement2(arr2);
        System.out.println(Arrays.toString(ans));

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

    public static void findCelebrity(int[][] arr) {
        Stack<Integer> check = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            check.push(i);
        }


        while (check.size() >= 2) {
            int a = check.pop();
            int b = check.pop();

            // a knows b , a can't be a celeb , a discard
            if(arr[a][b] == 1) {
                check.push(b);
            }
            // b knows a, b can't be a celeb , b discard
            else {
                check.push(a);
            }
        }

        int candidate = check.pop();

        for (int i = 0; i < arr.length; i++) {
            if(i == candidate)
                continue;

            if(arr[candidate][i] == 1 || arr[i][candidate] == 0){
                System.out.println("No celeb found");
                return;
            }
        }

        System.out.println(candidate + " is celebrity");
    }

    public static void nextGreaterElement(int[] arr) {
        Stack<Integer> s = new Stack<>();

        // go to every element
        for (int i = 0; i < arr.length; i++) {

            // arr[i] want to be next greater
            while (!s.isEmpty() && arr[i] >= s.peek()) {
                System.out.println(s.pop() + " -> " + arr[i]);
            }

            // push arr[i]
            s.push(arr[i]);
        }

        // if some values are left in stack, then there nge is -1
        while (!s.isEmpty()) {
            System.out.println(s.pop() + " -> -1");
        }
    }

    public static int[] nextGreaterElement2(int[] arr) {

        int[] ans = new int[arr.length];

        Stack<Integer> s = new Stack<>();

        // go to every element
        for (int i = 0; i < arr.length; i++) {

            // arr[i] want to be next greater
            while (!s.isEmpty() && arr[i] >= arr[s.peek()]) {
                ans[s.pop()] = arr[i];
            }

            // push index i
            s.push(i);
        }

        // if some values are left in stack, then there nge is -1
        while (!s.isEmpty()) {
            ans[s.pop()] = -1;
        }

        return ans;

    }

    public static int[] nextGreaterElement3(int[] arr) {

        Stack<Integer> s = new Stack<>();

        int[] ans = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {

            while (!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }

            if (s.isEmpty())
                ans[i] = -1;
            else
                ans[i] = s.peek();

            s.push(arr[i]);

        }

        return ans;

    }

    public static int[] stockSpan(int[] arr) {

        Stack<Integer> s = new Stack<>();

        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            while (!s.isEmpty() && arr[i] >= arr[s.peek()]) {
                s.pop();
            }

            if (s.isEmpty())
                ans[i] = i;
            else
                ans[i] = i - s.peek() - 1;

            s.push(i);

        }

        return ans;

    }
}
