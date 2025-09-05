package Map;

import java.util.HashMap;

public class HashMapPractice {
    public static void main(String[] args) {
        // creatung a hashmap
        HashMap<String, Double> marks = new HashMap<>();

        // adding 5 values names as key and marks as value
        marks.put("Raj", 89.99);
        marks.put("Amit", 78.65);
        marks.put("Rahul", 91.12);
        marks.put("John", 69.69);
        marks.put("Bob", 88.88);

        display(marks);

        System.out.println(marks.put("Amit", 69.69));
        System.out.println("Amit new marks: " + marks.get("Amit"));

    }

    public static void display(HashMap<String, Double> map) {
        for (String i : map.keySet()) {
            System.out.println(i + ": " + map.get(i));
        }

        // Set<Map.Entry<String, Double>> entries = map.entrySet();

        // for (Map.Entry<String, Double> entry : entries) {
        // System.out.println(entry);
        // }
    }
}
