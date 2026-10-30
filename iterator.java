import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> names = new ArrayList<String>();
        names.add("A");
        names.add("B");
        
        // Creating an Iterator to loop through the list
        Iterator<String> it = names.iterator();
        
        // Checking for next element and printing it
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}