import java.util.ArrayList;

/**
 * Created by Marc Nablu on 13/04/15.
 */
public class Queue {

    private ArrayList<String> items;

    public Queue(){
        items = new ArrayList<String>();
    }
    public boolean isEmpty(){ return items.isEmpty();}
    public void enqueue(String item){
            items.add(item);}
    public String dequeue(){
        return items.remove(0);
    }
}
