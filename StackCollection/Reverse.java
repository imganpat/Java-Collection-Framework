package StackCollection;

import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Stack<Character> string = new Stack<>();
        String str = "Hello";
        StringBuilder reversed = new StringBuilder();

        for (char c : str.toCharArray()) {
            string.push(c);
        }
        System.out.println(string);

        while (!string.isEmpty()) {
            reversed.append(string.pop());
        }

        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversed);

    }
}
