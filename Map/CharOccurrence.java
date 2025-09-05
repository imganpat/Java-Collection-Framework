package Map;

import java.util.HashMap;

public class CharOccurrence {
    public static void main(String[] args) {
        String str = "programming";

        HashMap<Character, Integer> charCounts = new HashMap<>();

        for (char c : str.toCharArray()) {
            // int count = (charCounts.get(c) == null) ? 1 : charCounts.get(c) + 1;
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        System.out.println(charCounts);
    }
}