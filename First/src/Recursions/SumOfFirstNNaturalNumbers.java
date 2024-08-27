package Recursions;

import java.util.Scanner;

public class SumOfFirstNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean execute = true;
        do {
            System.out.println("Enter your number(program will stop if 0(Zero) is entered):");
            int num = sc.nextInt();

            if (num == 0) {
                execute = false;
            } else {
                System.out.println(calculateSum(num));
            }

        } while (execute);
        System.out.println("Program Terminated");

    }

    private static int calculateSum(int num) {
        if (num == 0) {
            return 0;
        }
        return num + calculateSum(num - 1);
    }
}
