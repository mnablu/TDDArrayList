/**
 * Created by Marc Nablu on 13/04/15.
 */
public class TestQueue {

    public static void main(String[] args) {

        Queue queue = new Queue();
        System.out.println("After creating empty queue, isEmpty()" +
                "expected: true, actual: " + queue.isEmpty());
        queue.enqueue("one");
        queue.enqueue("two");
        queue.enqueue("three");

        System.out.println("After enqueing 3 values, isEmpty()" +
                "expected: false, actual: " + queue.isEmpty());
        System.out.println("test dequeuing, expected: one two three, actual: ");
        while (!queue.isEmpty()) {
            System.out.print(queue.dequeue() + " ");
        }
    }
}
