import java.util.HashMap;

public class PutDemo {
    public static void main(String[] args) {
        // 1. Create a new HashMap
        HashMap<String, Integer> scores = new HashMap<>();

        // 2. Add new key-value pairs
        scores.put("Alice", 90);
        scores.put("Bob", 85);

        // 3. Update an existing key ("Alice") with a new value
        scores.put("Alice", 95); 

        // 4. Print the final map contents
        System.out.println(scores);
    }
}