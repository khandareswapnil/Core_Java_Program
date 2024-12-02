import java.util.*;

import java.lang.Thread;
class A extends Thread {
     void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.printf("First Thread = %d\n", i);
                Thread.sleep(10000); // Sleep for 10 seconds
            }
        } catch (Exception ex) {
            System.out.println("Error in First Thread: " + ex);
        }
    }
}

class B extends Thread {
     void run() {
        try {
            for (int i = 1; i <= 50; i++) {
                System.out.printf("Second Thread = %d\n", i);
               Thread.sleep(1000); // Sleep for 1 second
            }
        } catch (Exception ex) {
            System.out.println("Error in Second Thread: " + ex);
        }
    }
}

public class ProcessApp {
    public static void main(String[] args) {
        A a1 = new A();
        a1.start();

        B b1 = new B();
        b1.start();
    }
}
