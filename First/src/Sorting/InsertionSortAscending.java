package Sorting;

import java.util.Arrays;

public class InsertionSortAscending {
    public static void main(String[] args) {
        int[] numbers = {8, 9, 5, 7, 6, 1, 2, 3, 4};
        for (int i = 1; i < numbers.length; i++) {
            int temp = numbers[i];
            int j = i - 1;
            while ((j >= 0) && (temp < numbers[j])) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = temp;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
