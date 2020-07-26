package com.inqoo.collections;

import java.util.*;
import java.util.Map.Entry;

import static java.util.Arrays.asList;

public class MainMap {
    public static void main(String[] args) {
        Map<String, List<String>> cities = new HashMap<>();
        List<String> citiesPL = new ArrayList<>();
        citiesPL.add("Katowice");
        citiesPL.add("Kraków");
        citiesPL.add("Warszawa");

        cities.put("PL", citiesPL);
        cities.put("US", new ArrayList<>(asList("NYC", "Orlando", "Washington", "Miami")));
        cities.put("JP", new ArrayList<>(asList("Tokyo", "Kyoto")));

        List<String> citiesUS = cities.get("US");
        System.out.println("US cities:");

        for (String city : citiesUS) {
            System.out.println(city);
        }

/*
        for (Entry<String, List<String>> wpis : cities.entrySet()) {
            wpis.getValue().add("London");
            System.out.print(wpis.getKey() + ": ");
            System.out.println(wpis.getValue());
        }
*/



    }
}
