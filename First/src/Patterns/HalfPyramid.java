package Patterns;

import java.util.Scanner;

/*
pattern: Half Pyramid
*
**
***
****
*****
******
*******
********

 */
public class HalfPyramid {
    public static void main(String[] args) {
        boolean execute = true;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your number(program will stop if 0(Zero) is entered):");
            int num = sc.nextInt();

            if (num == 0) {
                execute = false;
            } else {
                for (int row = 1; row <= num; row++) {
                    for (int column = 1; column <= row; column++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }

        } while (execute);
        System.out.println("Program Terminated");
    }
}
