import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // Add elements
        list.add(10);
        list.add(20);
        list.addFirst(5);
        list.addLast(30);

        System.out.println("LinkedList: " + list);

        // Access
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());

        // Remove
        list.removeFirst();
        list.removeLast();
        System.out.println("After removing ends: " + list);

        // Queue-like operations
        list.offer(40);
        list.offerFirst(1);
        System.out.println("After offers: " + list);

        System.out.println("Peek: " + list.peek());
        System.out.println("Poll: " + list.poll());

        System.out.println("Final List: " + list);
    }
}
