package com.inqoo.collections;

import java.util.*;

public class MainCollections {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Olaf", "Ania", "Kasia", "Paweł");

        List<String> daysOfWeek = new ArrayList<>();

        daysOfWeek.add("Pon");
        daysOfWeek.add("Wt");
        daysOfWeek.add("Sr");
        daysOfWeek.add("Czw");
        daysOfWeek.add("Pt");

        for (int i = daysOfWeek.size()-1; i >= 0; i--) {
            System.out.println(daysOfWeek.get(i));
        }

//        for (String day : daysOfWeek) {
//            System.out.println("Dzien tygodnia: " + day);
//        }
    }
}
