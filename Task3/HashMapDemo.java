import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        // Add entries
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.putIfAbsent(3, "Orange");

        System.out.println("HashMap: " + map);

        // Access
        System.out.println("Get key 2: " + map.get(2));
        System.out.println("GetOrDefault key 5: " + map.getOrDefault(5, "Not Found"));

        // Modify
        map.replace(2, "Mango");
        System.out.println("After replace: " + map);

        // Search
        System.out.println("Contains Key 1? " + map.containsKey(1));
        System.out.println("Contains Value Mango? " + map.containsValue("Mango"));

        // Iterate
        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());
        System.out.println("Entries: " + map.entrySet());

        // Remove
        map.remove(1);
        System.out.println("After remove: " + map);

        // Clear
        map.clear();
        System.out.println("Is Empty? " + map.isEmpty());
    }
}