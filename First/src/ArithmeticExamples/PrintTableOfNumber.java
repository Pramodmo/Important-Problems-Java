package ArithmeticExamples;

import java.util.Scanner;

public class PrintTableOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print table of it: ");
        int num = sc.nextInt();
        if (num == 0) {
            System.out.println("No Table for Zero(0)");
        }
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d", num, i, num * i).println();
        }
    }
}
