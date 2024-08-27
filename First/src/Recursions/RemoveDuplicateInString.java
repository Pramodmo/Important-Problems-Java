package Recursions;

import java.util.HashMap;

public class RemoveDuplicateInString {
    private static HashMap<Character, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        String str = "abbccda";
        removeDuplicates(str, 0, new StringBuilder(""));
    }

    private static void removeDuplicates(String str, int indx, StringBuilder newString) {
        if (indx == str.length()) {
            System.out.println(newString.toString());
            return;
        }
        if (map.containsKey(str.charAt(indx))) {
            removeDuplicates(str, indx + 1, newString);
        } else {
            map.put(str.charAt(indx), 1);
            newString.append(str.charAt(indx));
            removeDuplicates(str, indx + 1, newString);
        }
    }
}
