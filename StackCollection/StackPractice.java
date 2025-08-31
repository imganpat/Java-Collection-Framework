package StackCollection;

import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {
        // creating a stack
        Stack<String> colors = new Stack<>();

        // pushing 5 elements
        colors.push("Black");
        colors.push("Green");
        colors.push("Red");
        colors.push("Blue");
        colors.push("White");

        System.out.println(colors);

        // getting the top element
        System.out.println("Top element: " + colors.peek());

        // searching the element and returing its position
        System.out.println(colors.search("Green")); // indexing starts form 1 so ans is 4

        // displaying the stack
        while (!colors.isEmpty()) {
            System.out.println(colors.pop());
        }

    }
}
