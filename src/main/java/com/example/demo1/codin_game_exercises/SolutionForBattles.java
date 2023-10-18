package com.example.demo1.codin_game_exercises;

import java.util.Scanner;

public class SolutionForBattles {

    //You must convert a string of commands (separated by "-") into a message such that
    // (0) converts a number to the lower alphabet (1) converts a number to the UPPER ALPHABET and (2) just is the number
    public void decodeString() {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        StringBuilder stringBuilder = new StringBuilder();

        String[] split = string.split("-");
        for (String s : split) {
            String[] parts = s.split("\\)");
            int caseValue = Integer.parseInt(parts[0].substring(1));
            int number = Integer.parseInt(parts[1]);

            char c;
            if (caseValue == 0) {
                c = (char) ('a' + number);
            } else if (caseValue == 1) {
                c = (char) ('A' + number);
            } else {
                c = (char) ('0' + number);
            }
            stringBuilder.append(c);
        }

        System.out.println(stringBuilder);
    }

    // Given a string representing the item you are currently looking at item while dumpster diving,
    // you must output whether to YEET or to YOINK the item depending on if it is in your wishlist or not.
    //To "YEET" something means to throw it (discard) and to "YOINK" something means to grab it (keep).
    public void grabOrDiscardItem() {
        Scanner in = new Scanner(System.in);
        String wishlist = in.nextLine();
        int numberOfItemsToCheck = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        for (int i = 0; i < numberOfItemsToCheck; i++) {
            String item = in.nextLine();
            if (wishlist.contains(item)) {
                System.out.println("YOINK");
            } else {
                System.out.println("YEET");
            }
        }

    }

}
