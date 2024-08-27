package Recursions;

public class CheckArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 5};
        System.out.println(checkArray(arr, arr.length - 1));
    }

    private static boolean checkArray(int[] arr, int indx) {
        if (indx == 0)
            return true;
        if (arr[indx] > arr[indx - 1]) {
            return checkArray(arr, indx - 1);
        } else {
            return false;
        }
    }
}
