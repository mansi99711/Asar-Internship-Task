import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();

        // Add elements
        set.add("Banana");
        set.add("Apple");
        set.add("Orange");

        System.out.println("TreeSet (Sorted): " + set);

        // Access first & last
        System.out.println("First: " + ((TreeSet<String>) set).first());
        System.out.println("Last: " + ((TreeSet<String>) set).last());

        // Remove
        set.remove("Banana");
        System.out.println("After remove: " + set);
    }
}
