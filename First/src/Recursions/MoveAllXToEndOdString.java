package Recursions;

public class MoveAllXToEndOdString {
    public static void main(String[] args) {
        String str = "axbcxxd";
        moveAllX(str, 0, 0, new StringBuilder(""));
    }

    private static void moveAllX(String str, int indx, int count, StringBuilder newString) {
        if (indx > str.length() - 1) {
            for (int i = 1; i <= count; i++) {
                newString.append('x');
            }
            System.out.println(newString);
            return;
        }
        if (str.charAt(indx) == 'x') {
            count++;
            moveAllX(str, indx + 1, count, newString);
        } else {
            newString.append(str.charAt(indx));
            moveAllX(str, indx + 1, count, newString);
        }
    }
}
