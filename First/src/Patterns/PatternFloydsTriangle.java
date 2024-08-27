package Patterns;

/* PatternFloydsTriangle:
1
2  3
4  5  6
7  8  9  10
11 12 13 14 15
 */

import java.util.Scanner;

public class PatternFloydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean execute = true;
        do {
            System.out.println("Please enter the number you want: ");
            int numOfRows = sc.nextInt();
            if (numOfRows == 0) {
                execute = false;
            } else {
                int lastNum = 0;
                for (int i = 1; i <= numOfRows; i++) {
                    for (int j = 1; j <= i; j++) {
                        lastNum++;
                        System.out.print(lastNum + " ");
                    }
                    System.out.println();
                }
            }
        } while (execute);
    }

}
