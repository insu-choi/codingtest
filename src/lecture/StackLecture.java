package lecture;

import java.util.Stack;

public class StackLecture {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println(stack.push(1));
        System.out.println(stack.push(5));
        System.out.println(stack.pop());

        CustomStack<Integer> stack1 = new CustomStack<Integer>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        System.out.println(stack1.pop());
        System.out.println(stack1.toString());
        System.out.println(stack1.pop());
        System.out.println(stack1.toString());
        System.out.println(stack1.pop());
        System.out.println(stack1.toString());
    }
}
