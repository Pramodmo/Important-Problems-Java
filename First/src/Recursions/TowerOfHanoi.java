package Recursions;

//Time complexity = 2^n ( 2 to the power n)
public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, "S", "H", "D");
    }

    static void towerOfHanoi(int n, String source, String helper, String destination) {
        if (n == 1) {
            System.out.println("shift disk " + n + " from " + source + " to " + destination);
            return;
        }
        towerOfHanoi(n - 1, source, destination, helper);
        System.out.println("shift disk " + n + " from " + source + " to " + destination);
        towerOfHanoi(n - 1, helper, source, destination);
    }
}
