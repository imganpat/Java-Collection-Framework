package LinkedListCollection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Rotate {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println("Original list");
        display(list);

        rotate(3, list);
        display(list);

    }

    public static void rotate(int count, LinkedList<Integer> list) {
        count %= list.size();
        for (int i = 0; i < count; i++) {
            int temp = list.getFirst();
            list.addLast(temp);
            list.removeFirst();
        }
    }

    public static void display(LinkedList<Integer> list) {
        Iterator i = list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println();
    }
}
