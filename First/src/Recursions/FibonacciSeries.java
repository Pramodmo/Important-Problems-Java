package Recursions;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        int first = 0, second = 1;
        System.out.print(first + " ");
        System.out.print(second + " ");
        printFibonacciSeries(first, second, 10);
    }

    private static void printFibonacciSeries(int first, int second, int number) {
        if (number < 3) {
            return;
        }
        int third = first + second;
        System.out.print(third + " ");
        printFibonacciSeries(second, third, number - 1);
    }
}
