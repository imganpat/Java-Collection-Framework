/* 
Queue Operations with LinkedList
    Use LinkedList as a Queue.
    Perform enqueue (addLast) and dequeue (removeFirst) operations.
    Print the queue after each operation.
 */

package LinkedListCollection;

import java.util.Iterator;
import java.util.LinkedList;

public class QueueList {
    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>();
        enqueue(10, queue);
        enqueue(20, queue);
        enqueue(30, queue);

        display(queue);

        dequeue(queue);
        display(queue);
        dequeue(queue);
        display(queue);
        dequeue(queue);
        display(queue);

    }

    public static void enqueue(int element, LinkedList<Integer> list) {
        list.addLast(element);
    }

    public static void dequeue(LinkedList<Integer> list) {
        if (!list.isEmpty()) {
            list.removeFirst();
        } else {
            System.out.println("Queue is empty");
        }
    }

    public static void display(LinkedList list) {
        if (!list.isEmpty()) {
            Iterator i = list.iterator();
            while (i.hasNext()) {
                System.out.println(i.next());
            }
            System.out.println();
        } else {
            System.out.println("Queue is empty");
        }

    }
}
