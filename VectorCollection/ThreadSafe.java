package VectorCollection;

import java.util.Vector;

/* 
Thread-safe Demonstration
    Create two threads that add elements to the same Vector<Integer> and show that no data corruption happens.
 */
class Thread1 extends Thread {
    Vector<Integer> vector;

    Thread1(Vector<Integer> vector) {
        this.vector = vector;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            vector.add(i);
            System.out.println("Thread 1 added: " + i);
        }
    }
}

class Thread2 extends Thread {
    Vector<Integer> vector;

    Thread2(Vector<Integer> vector) {
        this.vector = vector;
    }

    public void run() {
        for (int i = 5; i < 10; i++) {
            vector.add(i);
            System.out.println("Thread 2 added: " + i);
        }
    }
}

public class ThreadSafe {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        Thread1 t1 = new Thread1(vector);
        Thread2 t2 = new Thread2(vector);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Vector: " + vector);
    }
}
