package com.inqoo.collections;

import java.util.HashMap;
import java.util.Map;

public class MainMap2 {
    public static void main(String[] args) {
        // map<String, Object>
        // tekst -> "Polska"
        // liczba -> 100
        // prawda -> true

        Map<String, Object> mapa = new HashMap<>();
        mapa.put("tekst", "Polska");
        mapa.put("liczba", 100);
        mapa.put("prawda", true);

        for (Map.Entry<String, Object> wpis : mapa.entrySet()) {
            System.out.println(wpis.getKey() + " to " + wpis.getValue());
        }

    }
}
