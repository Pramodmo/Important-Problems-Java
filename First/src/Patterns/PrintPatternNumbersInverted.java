package Patterns;

/* PatternNumber2:
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 */

import java.util.Scanner;

public class PrintPatternNumbersInverted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean execute = true;
        do {
            System.out.println("Please enter the number you want: ");
            int num = sc.nextInt();
            if (num == 0) {
                execute = false;
            } else {
                for (int i = num; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(j + " ");
                    }
                    System.out.println();
                }
            }
        } while (execute);
    }

}
