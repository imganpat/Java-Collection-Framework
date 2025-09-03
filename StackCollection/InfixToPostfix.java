package StackCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        String infix = "a+b*(c^d-e)^(f+g*h)-i";
        StringBuilder postfix = new StringBuilder();
        ArrayList<Character> operators = new ArrayList<>(Arrays.asList('^', '*', '/', '+', '-', '(', ')'));
        Stack<Character> stack = new Stack<>();
        int length = infix.length();

        for (int i = 0; i < length; i++) {
            char ch = infix.charAt(i);

            if (!operators.contains(ch)) {
                postfix.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() &&
                        getPrecidence(stack.peek()) >= getPrecidence(ch) &&
                        !(ch == '^' && stack.peek() == '^')) { // handle right-associativity for ^
                    postfix.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        System.out.println(infix);
        System.out.println(postfix);

    }

    public static int getPrecidence(char operator) {
        switch (operator) {
            case '^':
                return 3;
            case '*':
            case '/':
                return 2;

            case '+':
            case '-':
                return 1;

            default:
                return -1;
        }
    }
}
