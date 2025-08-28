package ArrayListCollection;

import java.util.ArrayList;
import java.util.Arrays;

public class Frequency {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 10, 40, 30, 20, 30, 20, 10));
        for (int value : list) {
            int count = 0;
            for (int innerValue : list) {
                if (value == innerValue)
                    count++;
            }
            System.out.println(value + " : " + count);
        }
    }
}
