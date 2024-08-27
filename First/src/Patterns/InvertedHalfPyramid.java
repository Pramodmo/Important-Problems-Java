package Patterns;

import java.util.Scanner;

/*
pattern:inverted Half Pyramid
         *
      *  *
   *  *  *
*  *  *  *
 */
public class InvertedHalfPyramid {
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
                    int spaces = num - row;
                    for (int column = 1; column <= num; column++) {
                        if (column <= spaces) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                }
            }

        } while (execute);
        System.out.println("Program Terminated");
    }
}
