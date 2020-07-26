package com.inqoo.collections;

import java.util.*;

public class MainList2 {
    public static void main(String[] args) {
        Set<Integer> numbers = new LinkedHashSet<>();

        numbers.add(1);
        numbers.add(2);

        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(3);
        numbers2.add(4);

        numbers.addAll(numbers2);

        for (Integer liczba : numbers) {
            System.out.println(liczba);
        }
    }
}
