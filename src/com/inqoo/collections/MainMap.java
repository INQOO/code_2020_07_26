package com.inqoo.collections;

import java.util.*;
import java.util.Map.Entry;

public class MainMap {
    public static void main(String[] args) {
        Map<String, List<String>> cities = new HashMap<>();

        List<String> citiesPL = Arrays.asList("Katowice", "Kraków", "Wawa");
        cities.put("PL", citiesPL);
        cities.put("US", Arrays.asList("NYC", "Orlando", "Washington", "Miami"));

        for (Entry<String, List<String>> wpis : cities.entrySet()) {
            System.out.print(wpis.getKey() + ": ");
            System.out.println(wpis.getValue());
        }

    }
}
