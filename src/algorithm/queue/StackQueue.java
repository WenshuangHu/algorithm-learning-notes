package algorithm.queue;

import java.util.Stack;

public class StackQueue {
    private static final Stack<Integer> INPUT_STACK = new Stack<>();
    private static final Stack<Integer> OUTPUT_STACK = new Stack<>();

    public static void main(String[] args) {
        StackQueue stackQueue = new StackQueue();
        stackQueue.push(1);
        stackQueue.push(2);
        System.out.println(stackQueue.pop());
        stackQueue.push(3);
        stackQueue.push(4);
        stackQueue.push(5);
        System.out.println(stackQueue.pop());
    }

    void push(int x) {
        INPUT_STACK.push(x);
    }

    int pop() {
        while(!INPUT_STACK.isEmpty()) {
            OUTPUT_STACK.push(INPUT_STACK.pop());
        }
        return OUTPUT_STACK.pop();
    }

    int peek() {
        while(!INPUT_STACK.isEmpty()) {
            OUTPUT_STACK.push(INPUT_STACK.pop());
        }
        return OUTPUT_STACK.peek();
    }

    boolean empty() {
        return INPUT_STACK.isEmpty() && OUTPUT_STACK.isEmpty();
    }
}
