package Recursions;

public class PrintXpowerNwithOrderOfLogN {
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(printXpowerN(x, n));
    }

    static int printXpowerN(int x, int n) {
        if (n == 1) {
            return x;
        }
        if (x == 0) {
            return 0;
        }
        if (n % 2 == 1)
            return printXpowerN(x, n / 2) * printXpowerN(x, n / 2) * x;

        return printXpowerN(x, n / 2) * printXpowerN(x, n / 2);
    }
}
