package Recursions;

public class ReverseString {
    public static void main(String[] args) {
        String str = "abcd";
        reverse(str, str.length() - 1);
    }

    public static void reverse(String string, int length) {
        if (length < 0)
            return;
        System.out.print(string.charAt(length));
        reverse(string, length - 1);
    }
}
