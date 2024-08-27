package Strings;

public class ReverseString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");

        for (int i = 0; i < sb.length() / 2; i++) {
            int back = sb.length() - 1 - i;
            char frontElement = sb.charAt(i);
            char backElement = sb.charAt(back);

            sb.setCharAt(i, backElement);
            sb.setCharAt(back, frontElement);

        }
        System.out.println(sb);

    }
}
