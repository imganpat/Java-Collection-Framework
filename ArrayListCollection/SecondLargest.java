package ArrayListCollection;

import java.util.ArrayList;
import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>(Arrays.asList(87, 69, 83, 74, 96, 53));
        System.out.println("Second highest marks: " + secondLargest(marks));
    }

    public static int secondLargest(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        for (int value : list) {
            if (max < value) {
                secondMax = max;
                max = value;
            }
        }
        return secondMax;
    }

    public static void display(ArrayList<Integer> list) {
        for (int item : list) {
            System.out.println(item);
        }
        System.out.println();
    }
}
