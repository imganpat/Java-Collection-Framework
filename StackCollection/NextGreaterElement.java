import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = new int[] { 4, 5, 2, 25 };
        int[] res = new int[arr.length];

        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            res[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }

        System.out.println(Arrays.toString(arr)); // [4, 5, 2, 25]
        System.out.println(Arrays.toString(res)); // [5, 25, 25, -1]
    }
}
