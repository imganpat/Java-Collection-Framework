/* 
Basic Practice Tasks with LinkedList
    ✅ Create a LinkedList of Strings
        ✅ Store names of 5 cities.
        ✅ Print the LinkedList.

    ✅ Access & Modify
        ✅ Print the first and last element.
        ✅ Change the element at index 2.
        ✅ Print the updated LinkedList.

    ✅ Add & Remove Elements
        ✅ Add a new city at the beginning.
        ✅ Add a new city at the end.
        ✅ Remove the first and last elements.
        ✅ Print the LinkedList after each change.

    ✅ Loop through LinkedList
        ✅ Print all elements using a normal for loop.
        ✅ Then print them again using a for-each loop.
        ✅ Then print using an Iterator.

    ✅ Check Size & Search
        ✅ Print the size of the LinkedList.
        ✅ Check if a particular city exists in it.
 */

package LinkedListCollection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPractise {
    public static void main(String[] args) {
        // creating a Linked list named cities
        LinkedList<String> cities = new LinkedList<>();

        // adding 5 city names in the list
        cities.add("Pune");
        cities.add("Jaipur");
        cities.add("Mumbai");
        cities.add("Bengaluru");
        cities.add("Ahmedabad");

        // displaying the list
        display(cities);

        // // accessing the first element
        // System.out.println("First city: " + cities.getFirst());

        // // accessing the last element
        // System.out.println("Last city: " + cities.getLast());
        // System.out.println();

        // // modifing the element at index 2
        // cities.set(2, "Navi Mumbai");
        // display(cities);

        // // adding a new element at the beginning
        // cities.addFirst("Pali");
        // display(cities);

        // // adding a new city at the end.
        // cities.addLast("Surat");
        // display(cities);

        // // Removing the first and last elements.
        // cities.removeFirst();
        // cities.removeLast();
        // display(cities);

        // printing the size of the list
        System.out.println("The size of list is : " + cities.size());

        // checking if a particular city exists in the list or not
        System.out.println("Is Pune in the list: " + cities.contains("Pune"));
        System.out.println("Is Chennai in the list: " + cities.contains("Chennai"));

    }

    public static void display(LinkedList<String> list) {
        // for (String element : list) {
        // System.out.println(element);
        // }
        // System.out.println();

        // printing list element using normal for loop
        // int listSize = list.size();
        // for (int i = 0; i < listSize; i++) {
        // System.out.println(list.get(i));
        // }
        // System.out.println();

        // printing list elements using iterator
        Iterator<String> i = list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println();
    }
}
