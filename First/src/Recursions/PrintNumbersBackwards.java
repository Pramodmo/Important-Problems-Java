package Recursions;

import java.util.Scanner;

public class PrintNumbersBackwards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean execute = true;
        do {
            System.out.println("Enter your number(program will stop if 0(Zero) is entered):");
            int num = sc.nextInt();

            if (num == 0) {
                execute = false;
            } else {
                printNumbers(num);

            }

        } while (execute);
        System.out.println("Program Terminated");

    }

    private static void printNumbers(int num) {
        if (num < 1) {
            return;
        }
        System.out.println(num);
        printNumbers(num - 1);
    }
}
