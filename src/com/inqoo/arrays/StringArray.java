package com.inqoo.arrays;

import java.util.Arrays;
import java.util.Random;

public class StringArray {
    public static void main(String[] args) {
        // stworzyc tablice stringow menu o dlugosci 7
        // w petli do kazdego elementu przypisz Kasza

        String[] menu = new String[7];

        Arrays.fill(menu, "Kasza");
        System.out.println(Arrays.toString(menu));
    }
}
