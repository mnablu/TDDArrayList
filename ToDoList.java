import java.util.ArrayList;

/**
 * Created by Marc Nablu on 13/04/15.
 */
public class ToDoList {

    private ArrayList<String> items;
    private ArrayList<String> completed;

    public ToDoList(){
        items = new ArrayList<String>();
        completed = new ArrayList<String>();
    }
    public void add(String item){
        items.add(item);
    }
    public String getCompleted(){return completed.toString();}
    public void markCompleted(String item){
        for (int index = 0; index< items.size(); ++index) {
            if (items.get(index).equals(item)) {

                completed.add(items.remove(index));
                break;
            }

        }
    }
        public int count () {
            return items.size();
        }
    }