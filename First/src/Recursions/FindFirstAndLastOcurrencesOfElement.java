package Recursions;

public class FindFirstAndLastOcurrencesOfElement {
    private static int first = -1;
    private static int last = -1;

    public static void main(String[] args) {
        String str = "abaacdaefaah";
        char ch = 'a';
        findFirstAndLastPosition(str, ch, str.length() - 1);
    }

    private static void findFirstAndLastPosition(String str, char ch, int length) {
        if (length < 0) {
            System.out.println("First: " + first);
            System.out.println("Last: " + last);
            return;
        }
        if (last == -1 && str.charAt(length) == ch) {
            last = length;
        } else if (last != -1 && str.charAt(length) == ch) {
            first = length;
        }
        findFirstAndLastPosition(str, ch, length - 1);
    }
}
