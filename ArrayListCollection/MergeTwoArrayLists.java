/* 
    Merge Two ArrayLists
        Create two ArrayList<Integer> with some numbers.
        Merge them into one list.
        Print the merged list
 */

package ArrayListCollection;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(10, 20, 20, 30));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(30, 40, 50, 60));
        ArrayList<Integer> mergedList = new ArrayList<>();

        // merging entire list with dublicates
        // mergedList.addAll(list1);
        // mergedList.addAll(list2);
        // display(mergedList);

        // merging without dublicates
        for (int value : list1) {
            if (!mergedList.contains(value)) {
                mergedList.add(value);
            }
        }
        for (int value : list2) {
            if (!mergedList.contains(value)) {
                mergedList.add(value);
            }
        }

        display(mergedList);

    }

    public static <T> void display(ArrayList<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
        System.out.println();
    }
}