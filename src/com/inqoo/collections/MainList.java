package com.inqoo.collections;

import java.util.ArrayList;
import java.util.List;

public class MainList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(10);
        numbers.add(1);
        numbers.add(5000);

        numbers.remove(3);
        numbers.add(15);

        if(numbers.contains(10)) {
            System.out.println("Jest!");
        }


        if(numbers.isEmpty()) {
            System.out.println("Lista jest pusta");
        } else {
            for (Integer cokolwiek : numbers) {
                System.out.println(cokolwiek);
            }
        }


    }
}
