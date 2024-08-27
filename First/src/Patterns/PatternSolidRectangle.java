package Patterns;

/*
Solid Rectangle: 4 rows and 5 column
*****
*****
*****
*****
 */
public class PatternSolidRectangle {

    public static void main(String[] args) {
        for (int row = 1; row <= 4; row++) {
            for (int column = 1; column <= 5; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
