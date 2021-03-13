package ru.sobestasks;

import java.util.Arrays;

/**
 * Получить список пропущенных чисел в массиве 1..n
 */
public class MissingNumbersInArray {
    public static void main(String[] args) {
        printMissingNumbers(new int[]{1, 2, 3, 6}, 6); // [4,5]
        printMissingNumbers(new int[]{1, 2, 3, 4, 5, 6}, 6); // []
        printMissingNumbers(new int[]{6}, 6); // [1,2,3,4,5]
        printMissingNumbers(new int[]{1}, 6); // [2,3,4,5,6]
        printMissingNumbers(new int[]{1, 6}, 6); // [2,3,4,5]
        printMissingNumbers(new int[]{2, 4, 5}, 6); // [1,3,6]
        printMissingNumbers(new int[]{}, 6); // [1,2,3,4,5,6]
    }

    static void printMissingNumbers(int[] numbers, int count) {
        int[] missing = getMissingNumbers(numbers, count);

        System.out.println(String.format("Пропущенные числа до %d: %s  в массиве %s", count, Arrays.toString(missing), Arrays.toString(numbers)));
    }

    static int[] getMissingNumbers(int[] numbers, int count) {
        int[] result = new int[count - numbers.length];
        int lastMissingNumber = 1;
        int resultIndex = 0;

        for (int num : numbers) {
            while (num != lastMissingNumber) {
                result[resultIndex++] = lastMissingNumber++;
            }
            lastMissingNumber++;
        }

        while (lastMissingNumber <= count) {
            result[resultIndex++] = lastMissingNumber++;
        }

        return result;
    }
}
