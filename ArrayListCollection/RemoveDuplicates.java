/* 
    Remove Duplicates
        Create an ArrayList<String> with some duplicate values (e.g., ["Apple", "Mango", "Apple", "Orange", "Mango"]).
        Write logic to remove duplicates while keeping only unique elements.
        Print before and after.
 */
package ArrayListCollection;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Mango", "Apple", "Orange", "Mango"));
        display(fruits);
        removeDuplicates(fruits);
        display(fruits);
    }

    public static void removeDuplicates(ArrayList<String> list) {
        ArrayList<String> temp = new ArrayList<>();
        for (String element : list) {
            if (!temp.contains(element)) {
                temp.add(element);
            }
        }
        list.clear();
        list.addAll(temp);
    }

    public static void display(ArrayList<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
        System.out.println();
    }
}
