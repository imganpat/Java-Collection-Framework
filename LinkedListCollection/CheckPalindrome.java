package LinkedListCollection;

import java.util.Arrays;
import java.util.LinkedList;

public class CheckPalindrome {
    public static void main(String[] args) {
        LinkedList<Character> listOfChar = new LinkedList<>(Arrays.asList('R', 'A', 'C', 'E', 'C', 'A', 'R'));
        LinkedList<Character> reversedListOfChar = listOfChar.reversed();

        System.out.println((listOfChar.equals(reversedListOfChar)) ? "True" : "False");

        // LinkedList<Character> listOfChar = new LinkedList<>(Arrays.asList('R', 'A',
        // 'C', 'E', 'C', 'A', 'R'));
        // int listSize = listOfChar.size();
        // boolean isPalindrome = true;

        // for (int i = 0, j = listSize - 1; i < listSize && j >= 0; i++, j--) {
        // if (!listOfChar.get(i).equals(listOfChar.get(j))) {
        // isPalindrome = false;
        // break;
        // }
        // }

        // System.out.println(isPalindrome ? "True" : "False");
    }

}
