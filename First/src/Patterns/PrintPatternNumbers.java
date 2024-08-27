package Patterns;

/* PatternNumber:
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
 */

import java.util.Scanner;

public class PrintPatternNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean execute = true;
        do {
            System.out.println("Please enter the number you want: ");
            int num = sc.nextInt();
            if (num == 0) {
                execute = false;
            } else {
                for (int i = 1; i <= num; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(j + " ");
                    }
                    System.out.println();
                }
            }
        } while (execute);
    }

}
