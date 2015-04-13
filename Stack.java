import java.util.ArrayList;

/**
 * Created by Marc Nablu on 13/04/15.
 */
public class Stack {
    private ArrayList<String> values;

    public Stack(){
        values = new ArrayList<String>();
    }

    public boolean isEmpty() {
        return values.isEmpty();
    }
    public void push(String value){
        values.add(value);
    }
    public void pop(){
        values.remove(values.size()-1); //remove last
    }

    public String top() {
        return values.get(values.size() -1); //last value
    }
}
