/* 

Reverse an ArrayList
    Create an ArrayList<Integer> with some numbers.
    Print the original list.
    Reverse the list (without using Collections.reverse() first).
    Print the reversed list.
    (Later you can also try with Collections.reverse() as a shortcut.)

 */

package ArrayListCollection;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        ArrayList<Integer> list = new ArrayList<>();

        for (int value : arr) {
            list.add(value);
        }

        // reversing a list without in-built methods
        // display(list);
        // reverseList(list);
        // display(list);

        // reversing a list with in-built method
        display(list);
        Collections.reverse(list);
        display(list);
    }

    public static <T> void display(ArrayList<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
        System.out.println();
    }

    // custom method to reverse a list
    public static void reverseList(ArrayList<Integer> list) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            temp.add(list.get(i));
        }
        list.clear();
        list.addAll(temp);

        // second logic but time complexity is high
        // int listSize = list.size();
        // for (int i = 0; i < listSize; i++) {
        // temp.add(0, list.get(i));
        // }
        // list.clear();
        // list.addAll(temp);

    }
}
