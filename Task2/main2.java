@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

public class main2 {

    public static void main(String[] args) {
        // ---------- 1. LAMBDA EXPRESSION IMPLEMENTATION ----------
        System.out.println("---- Lambda Expression Demo ----");
        Greeting greeting = (name) -> System.out.println("Hello, " + name + "!");
        greeting.sayHello("Mansi");

        // ---------- 2. EXCEPTION HANDLING ----------
        System.out.println("\n---- Exception Handling Demo ----");
        try {
            int num = 10;
            int denom = 0;
            int result = num / denom; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
        } finally {
            System.out.println("Finally block executed.");
        }

        // ---------- 3. MULTITHREADING ----------
        System.out.println("\n---- Multithreading Demo ----");

        // Method 1: Extending Thread class
        class MyThread extends Thread {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Thread class: " + i);
                    try { Thread.sleep(500); } catch (InterruptedException e) {}
                }
            }
        }

        // Method 2: Implementing Runnable interface
        class MyRunnable implements Runnable {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Runnable interface: " + i);
                    try { Thread.sleep(500); } catch (InterruptedException e) {}
                }
            }
        }

        Thread t1 = new MyThread(); // Using Thread class
        Thread t2 = new Thread(new MyRunnable()); // Using Runnable

        t1.start();
        t2.start();
    }
}

