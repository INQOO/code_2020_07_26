package com.inqoo.arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        String[][] weekDays = new String[][]{
                {"PL", "pon", "wt", "sr", "czw", "pt", "sb", "nd"},
                {"EN", "mon", "tue", "wed", "thu", "fri", "sat", "sun"}
        };
        for (int i = 0; i < weekDays.length; i++) {
            System.out.println("LANG: " + weekDays[i][0]);

            for (int j = 1; j < weekDays[i].length; j++) {
                System.out.print(weekDays[i][j] + " ");
            }

            System.out.println();
        }

    }
}
