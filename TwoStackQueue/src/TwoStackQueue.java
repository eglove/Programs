import java.util.ArrayList;
import java.util.Stack;

/**
 * Implement a queue using two stacks. Recall that a queue is a FIFO (first-in, first-out) data structure with the
 * following methods: enqueue, which inserts an element into the queue, and dequeue, which removes it.
 */
public class TwoStackQueue {

    static Stack<Integer> mainStack = new Stack<Integer>();
    static Stack<Integer> tempStack = new Stack<Integer>();

    public static void main(String[] args) {
        ArrayList<Integer> queue  = new ArrayList<>();
        enQueue(1);
        enQueue(2);
        enQueue(3);
        System.out.println(mainStack);
        deQueue();
    }

    static void enQueue(int x) {
        // Move all from mainStack to tempStack to push integer to bottom
        while (!mainStack.isEmpty()) {
            tempStack.push(mainStack.pop());
        }

        mainStack.push(x);

        // Move everything back on top of x
        while (!tempStack.isEmpty()) {
            mainStack.push(tempStack.pop());
        }
    }

    // Return pop is queue is not empty.
    static void deQueue() {

        if(mainStack.isEmpty()) {
            System.out.println("Queue is empty.");
            System.exit(0);
        }

        int x = mainStack.peek();
        mainStack.pop();
    }
}
