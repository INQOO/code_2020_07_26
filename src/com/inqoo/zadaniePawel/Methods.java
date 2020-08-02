package com.inqoo.zadaniePawel;

import java.util.*;

import static java.lang.System.in;
import static java.lang.System.out;

public class Methods {
    // Cwiczenie 1
    public static boolean loneTeen(int a, int b) {
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);
        return (aTeen && !bTeen) || (!aTeen && bTeen);
    }

    public static void startAgeTeen() {
        out.println("Podaj Twój wiek i koleżanki, sprawdzimy czy chociaż jedna z Was jest NASTOLATKĄ! ;)");
        Scanner scanner = new Scanner(in);
        int a = scanner.nextInt();
        out.println("Teraz wiek koleżanki:");
        int b = scanner.nextInt();
        boolean age = loneTeen(a, b);
        if (a >= 13 && a <= 19 && b >= 13 && b <= 19) {
            out.println("WOW oboje jesteście nastolatkami");
        } else if (age) {
            out.println("Jedna z Was jest Nastolatką!");
        } else {
            out.println("Nie jesteście Nastolatkami");
        }
    }

    // Cwiczenie 2
    public static int arrayCount9(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 9) {
                count++;
            }
        }
        return count;
    }

    public static int[] newArray(int n) {
        int[] result = new int[n];
        for (int i = 0; i < result.length; i++) {
            result[i] = (int) (1 + Math.random() * 10);
        }
        return result;
    }

    public static void startArray9() {
        out.println("Podaj z ilu elementów ma składać się tablica - będziemy szukać ile razy pojawi się 9");
        Scanner scanner = new Scanner(System.in);
        int elementsNumbers = scanner.nextInt();
        int[] newRandomArray = newArray(elementsNumbers);
        System.out.println(Arrays.toString(newRandomArray));
        out.println("W wylosowanej tablicy składającej się z " + elementsNumbers + " elementów cyfra '9' znajduje się: " + arrayCount9(newRandomArray));
    }

    // Cwiczenie 3
    public static void startFirstChar() {
        out.println("Podaj liczbe wyrazów, które uporządkujemy według pierwszej litery");
        Scanner scanner = new Scanner(System.in);
        int numberOfWords = scanner.nextInt();
        out.println("Wypiszesz tyle wyrazów: " + numberOfWords + ", ale najpierw podaj pierwsze:");
        List<String> words = new ArrayList(Arrays.asList());
        for (int i = 0; i < numberOfWords; i++) {
            Scanner scanner2 = new Scanner(System.in);
            String word = scanner.next();
            words.add(word);
            if (i < numberOfWords - 1) {
                out.println("Podaj kolejny wyraz");
            }
        }
        Map<String, List<String>> map = new HashMap();
        for (String word : words) {
            String firstChar = String.valueOf(word.charAt(0));
            if (map.get(firstChar) == null) {
                map.put(firstChar, new ArrayList(Arrays.asList(word)));
            } else {
                map.get(firstChar).add(word);
            }
        }
        out.println("Nasze słowa to: " + words);
        out.println("Uporządkowane słowa to: " + map);
    }
}
