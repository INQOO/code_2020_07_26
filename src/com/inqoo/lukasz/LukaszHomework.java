package com.inqoo.lukasz;

import java.util.*;

class LukaszHomework {

    static boolean loneTeen;

    static boolean loneTeen(int a, int b) {
    boolean liczbaA = a >= 13 && a <= 19;
    boolean liczbaB = b >= 13 && b <= 19;

        if (!liczbaA && liczbaB || liczbaA && !liczbaB) {
            loneTeen = true;
        }
        else{
            loneTeen = false;
        }
        System.out.println(loneTeen);
        return loneTeen;
    }

    static int arrayCount9(int a, int b, int c){
        int[] nums = {a, b, c};
        int count = 0;
        for (int i = 0; i < (nums.length)  ; i++) {
            if (nums[i] == 9){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    static Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String chars : strings) {
            if (!map.containsKey(chars.substring(0,1))) {
                map.put(chars.substring(0,1), chars);
            }
            else {
                String empty = map.get(chars.substring(0,1));
                map.put(chars.substring(0,1), empty + chars);
            }
        }
        System.out.println(map);
        return map;
    }
}