/**
 * Stack class - TDD of the stack class
 * Created by Marc Nablu on 13/04/15.
 */
public class TestStack {
    public static void main(String[] args) {

        System.out.println("Test 1: isEmpty");
        Stack stack = new Stack();
        boolean result = stack.isEmpty();
        System.out.println("expected: true actual: " + result);

        System.out.println("Test 2: push makes isEmpty false");
        stack = new Stack();
        stack.push("one");
        result = stack.isEmpty();
        System.out.println("expected: false actual: " + result);

        System.out.println("Test 3: pop to make the stack empty");
        stack = new Stack();
        stack.push("one");
        stack.push("two");
        stack.pop();
        stack.pop();
        result = stack.isEmpty();
        System.out.println("expected: true actual: " + result);

        System.out.println("Test 4: top");
        stack = new Stack();
        stack.push("1");
        String str = stack.top();
        stack.push("2");
        str += stack.top();
        stack.push("3");
        str += stack.top();
        while (!stack.isEmpty()) {
            str += stack.top();
            stack.pop();
        }
        System.out.println("expected: 123321 actual: " + str);
    }
}
