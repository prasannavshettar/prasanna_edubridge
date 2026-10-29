import java.util.HashSet;

public class Illustrate {
    public static void main(String[] args) {
        // Creating a HashSet to store String elements
        HashSet<String> tags = new HashSet<>();
        
        // Adding elements to the set
        tags.add("Java");
        tags.add("Python");
        tags.add("C++");
        
        // Iterating over the HashSet using a for-each loop
        for (String tag : tags) {
            System.out.println(tag);
        }
    }
}