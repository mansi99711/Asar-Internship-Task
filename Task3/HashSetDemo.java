import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        // Add elements
        set.add("Red");
        set.add("Green");
        set.add("Blue");
        set.add("Red"); // Duplicate ignored

        System.out.println("HashSet: " + set);

        // Remove
        set.remove("Green");
        System.out.println("After remove: " + set);

        // Search
        System.out.println("Contains Blue? " + set.contains("Blue"));

        // Size
        System.out.println("Size: " + set.size());

        // Iterate
        set.forEach(color -> System.out.println("Color: " + color));

        // Clear
        set.clear();
        System.out.println("Is Empty? " + set.isEmpty());
    }
}
