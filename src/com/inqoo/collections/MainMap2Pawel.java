package com.inqoo.collections;

import java.util.HashMap;
import java.util.Map;

public class MainMap2Pawel {
    public static void main(String[] args) {
        Map<String, Object> mapa = new HashMap<>();
        mapa.put("tekst", "Polska");
        mapa.put("liczba", 100);
        mapa.put("prawda", true);

//        Object liczba = mapa.get("liczba");
//        System.out.println(liczba);
//
//        String tekst = (String) mapa.get("tekst");
//        System.out.println(tekst);

        for (Map.Entry<String,Object> wpis :mapa.entrySet()){
            System.out.println(wpis.getKey() + " to " +wpis.getValue());

        }

    }
}
