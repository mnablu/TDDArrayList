/**
 * Created by Marc Nablu on 13/04/15.
 */
public class TestToDoList {
    public static void main(String[] args) {
        ToDoList todo = new ToDoList();
        System.out.println("Size after creating (expected value: 0" +
                "actual: " + todo.count());
        todo.add("buy milk");
        todo.add("mow the lawn");
        todo.add("buy an oculus rift");
        System.out.println("Size after adding (expected value: 3)"+
                " actual: " + todo.count());

        todo.markCompleted("buy an oculus rift");
        System.out.println("Size after completing a todo (expected value: 2)" +
                    " actual: " + todo.count());

        todo.markCompleted("unknown");
        System.out.println("Size after completing an invalid todo (expected value: 2)" +
                    " actual: " + todo.count());
        System.out.println("Currently completed items(expected[buy an oculus rift])" +
                    " actual: " + todo.getCompleted());
    }


}
