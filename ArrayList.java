import java.util.ArrayList;

public class RemoveDemo {
    public static void main(String[] args) {
        // 1. Initialize an empty ArrayList of Strings
        ArrayList<String> names = new ArrayList<String>();
        
        // 2. Add three elements to the list
        names.add("A"); // Index 0
        names.add("B"); // Index 1
        names.add("C"); // Index 2
        // Current List: ["A", "B", "C"]
        
        // 3. Remove by Index
        names.remove(1); 
        // This targets Index 1, which holds "B".
        // Current List: ["A", "C"] (Notice "C" shifts left to Index 1)
        
        // 4. Remove by Value
        names.remove("C"); 
        // This looks for the string "C" and deletes it.
        // Current List: ["A"]
        
        // 5. Output the final list
        System.out.println(names); 
        // Output: [A]
    }
}