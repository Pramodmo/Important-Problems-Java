package Patterns;

/* PatternNumber:

1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

 */

import java.util.Scanner;

public class PrintPatternZeroOneTriangle {
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
                        if ((!isEven(i) && !isEven(j)) || (isEven(i) && isEven(j))) {
                            System.out.print("1" + " ");
                        } else {
                            System.out.print("0" + " ");
                        }
                    }
                    System.out.println();
                }
            }
        } while (execute);
    }

    public static boolean isEven(Integer num) {
        return num % 2 == 0;
    }

}
