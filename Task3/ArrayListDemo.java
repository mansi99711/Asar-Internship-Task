import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add(1, "Mango");

        System.out.println("ArrayList: " + list);

        // Access & Modify
        System.out.println("Element at index 2: " + list.get(2));
        list.set(2, "Pineapple");
        System.out.println("After set: " + list);

        // Remove
        list.remove("Banana");
        list.remove(0);
        System.out.println("After removals: " + list);

        // Search
        System.out.println("Contains Mango? " + list.contains("Mango"));
        System.out.println("Index of Mango: " + list.indexOf("Mango"));

        // Size
        System.out.println("Size: " + list.size());

        // Iterate
        System.out.println("Using for-each loop:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // Clear
        list.clear();
        System.out.println("Is Empty? " + list.isEmpty());
    }
}
