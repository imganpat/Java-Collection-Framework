package ArrayListCollection;

import java.util.ArrayList;
import java.util.Arrays;

public class SubList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        ArrayList<Integer> subList = new ArrayList<>(list.subList(3, 7));
        display(list);
        display(subList);
    }

    public static <T> void display(ArrayList<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
        System.out.println();
    }

}
