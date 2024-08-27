package Samples;

import java.util.Stack;

class Test {

    // Main Method
    public static void main(String[] args) {
        Stack<Integer> int_stack = new Stack<>();
        int_stack.push(1);
        int_stack.push(2);
        int_stack.push(3);
        int_stack.push(4);

        int_stack.pop();


        System.out.println(int_stack);
    }
}