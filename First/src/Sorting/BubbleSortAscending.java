package Sorting;

import java.util.Arrays;

public class BubbleSortAscending {
    public static void main(String[] args) {
        int[] numbers = {9, 8, 5, 7, 6, 1, 2, 3, 4};

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(numbers));

    }
}

