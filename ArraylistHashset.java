import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("A");
        names.add("B");
        names.add("A");
        
        HashSet<String> unique = new HashSet<>(names);
        System.out.println(unique);
    }
}