package com.inqoo.zadaniePawel;

import java.util.Scanner;

import static java.lang.System.*;

public class Methods {

    public static boolean loneTeen(int a, int b) {
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);
        return (aTeen && !bTeen) || (!aTeen && bTeen);
    }

    public static void startWelcome() {
        out.println("Podaj Twój wiek i koleżanki, sprawdzimy czy chociaż jedna z Was jest NASTOLATKĄ! ;)");
        Scanner scanner = new Scanner(in);
        int a = scanner.nextInt();
        out.println("Teraz wiek koleżanki:");
        int b = scanner.nextInt();
        boolean wiek = loneTeen(a, b);
        if (a >= 13 && a <= 19 && b >= 13 && b <= 19) {
            out.println("WOW oboje jesteście nastolatkami");
        } else if (wiek) {
            out.println("Jedna z Was jest Nastolatką!");
        } else {
            out.println("Nie jesteście Nastolatkami");
        }
    }
}
