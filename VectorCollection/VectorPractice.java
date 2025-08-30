/* 
Basic Practice with Vector
    ✅ Create & Print Vector
        ✅ Create a Vector<String> of 5 fruits.
        ✅ Print all fruits using a simple for loop and for-each loop.
    ✅ Access Elements
        ✅ Print the first and last element of a Vector<Integer>.
        ✅ Change the element at index 2.
    ✅ Insert & Remove
        ✅ Add an element at the beginning and end of the vector.
        ✅ Remove the element at index 3.
    Check Existence
        Write a program to check if a given element exists in a Vector<String>.
        Print "Found" or "Not Found".
*/

package VectorCollection;

import java.util.Vector;

public class VectorPractice {
    public static void main(String[] args) {
        // creating a vector
        Vector<Integer> vector = new Vector<>();

        // adding 5 elements in vector
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);

        // printing the vector
        System.out.println(vector);

        // // printing the first element
        // System.out.println("First element: " + vector.getFirst());

        // // printing the last element
        // System.out.println("Last element: " + vector.getLast());

        // // changing the element present at index 2
        // vector.set(2, 100);
        // System.out.println(vector);

        // adding element at the beginning of the vector
        vector.add(0, 100);

        // adding element at the end of the vector
        vector.add(200);

        // removing the element presebt at index 3
        vector.remove(3);

        System.out.println(vector);
    }
}
