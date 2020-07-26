package com.inqoo.arrays;

import java.util.Arrays;
import java.util.Random;

public class SortNumbersOlaf {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
           numbers[i] = random.nextInt(101);
        }

        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Posortowano:\n"
                + Arrays.toString(numbers));
    }
}
