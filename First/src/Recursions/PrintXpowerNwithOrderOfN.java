package Recursions;

public class PrintXpowerNwithOrderOfN {
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
        return x * printXpowerN(x, n - 1);

    }
}
