package StackCollection;

import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        String expression = "((a+b)";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(') {
                stack.push(expression.charAt(i));
            }
            if (expression.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    System.out.println("Not balanced");
                    return;
                }
                stack.pop();
            }
        }

        System.out.println((stack.isEmpty()) ? "Balanced" : "Not balanced");
    }
}
