/* 
Basic Practice Tasks with ArrayList
    Create an ArrayList of Strings
        Store names of 5 fruits.
        Print the ArrayList.

    Access & Modify
        Print the element at index 2.
        Change the element at index 1 to a new fruit.
        Print the updated ArrayList.

    Remove Elements
        Remove the element at index 3.
        Print the ArrayList after removal.

    Loop through ArrayList
        Print all elements using a normal for loop.
        Then print them again using a for-each loop.

    Check Size & Search
        Print the size of the ArrayList.
        Check if a particular fruit (e.g., "Mango") exists in it.
 */

package ArrayListCollection;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        // creating a array list
        ArrayList<String> fruits = new ArrayList<>();

        // adding 5 fruits
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Fig");
        fruits.add("Guava");
        fruits.add("Watermellon");
        display(fruits);

        // printing the fruit present at index 2
        System.out.println("Fruit at index 2 is " + fruits.get(2));
        System.out.println();

        // updating the fruit at index 1 to Papaya
        fruits.set(1, "Papaya");
        display(fruits);

        // removing the fruit present at 3rd index
        fruits.remove(3);
        display(fruits);

        // printing the size of fruit list
        System.out.println("Size of fruit list is " + fruits.size());
        System.out.println();

        // checking if mango is present in the list
        System.out.println(fruits.contains("Mango"));
        System.out.println(fruits.contains("Mango") ? "Mango hai" : "Nhi hai");
        System.out.println();

        // adding mango at index 0
        fruits.add(0, "Mango");
        display(fruits);

    }

    public static void display(ArrayList<String> list) {
        int listSize = list.size();
        // for (int i = 0; i < listSize - 1; i++) {
        // System.out.println(list.get(i));
        // }
        for (String item : list) {
            System.out.println(item);
        }
        System.out.println();
    }

}