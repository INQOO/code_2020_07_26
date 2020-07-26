package com.inqoo.arrays;

public class Main {

    public static void main(String[] args) {
        String[][] weekDays = new String[][]{
                {"PL", "pon", "wt", "sr", "czw", "pt", "sb", "nd"},
                {"EN", "mon", "tue", "wed", "thu", "fri", "sat", "sun"}
        };
        System.out.println("Dlugosc tablicy: " + weekDays.length);
        System.out.println("Dlugosc pierwszego elementu tablicy weekdays: " + weekDays[0].length);
        System.out.println("Niedziela po angielsku to: " + weekDays[1][7]);
        // petla for ktora przechodzi po kazdym elemencie tablicy (ktory to jest kolejna tablica)
        for (int i = 0; i < weekDays.length; i++) {
            System.out.println("LANG: " + weekDays[i][0]);

            for (int j = 1; j < weekDays[i].length; j++) {
                System.out.print(weekDays[i][j] + " ");
            }

            System.out.println();
        }

    }
}
