import java.util.LinkedList;

public class AddToFrontAndBack {
    public static void main(String[] args) {
        // Initializing a LinkedList of Strings
        LinkedList<String> list = new LinkedList<String>();
        
        // Adding elements to the front and back
        list.addFirst("a");
        list.addFirst("b");
        list.addLast("c");
        
        // Printing the final list structure
        System.out.println(list);
    }
}