package Patterns;

/*
Hallow Rectangle: 4 rows and 5 column

*****
*   *
*   *
*****

 */
public class PrintHollowRectangle {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= m; column++) {
                if (row == 1 || row == n || column == 1 || column == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
