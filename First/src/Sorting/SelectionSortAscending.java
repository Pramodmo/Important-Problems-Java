package Sorting;

import java.util.Arrays;

//time complexity :O(n^2)
public class SelectionSortAscending {
    public static void main(String[] args) {
        int[] numbers = {9, 10, 8, 5, 7, 6, 1, 2, 3, 4};

        for (int i = 0; i < numbers.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[min] > numbers[j]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = numbers[i];
                numbers[i] = numbers[min];
                numbers[min] = temp;
            }

        }

        System.out.println(Arrays.toString(numbers));
    }
}
