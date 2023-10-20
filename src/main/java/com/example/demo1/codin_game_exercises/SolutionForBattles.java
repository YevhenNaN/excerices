package com.example.demo1.codin_game_exercises;

import java.util.ArrayList;
import java.util.List;
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

    /**
     * Given a number n, your task is to report the number of its divisors but if n is prime print "PRIME"
     * For example, if n is 16, the correct answer is 5 because its divisors are 1,2,4,8,16.
     */
    public void findDivisors() {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++){
            if (N % i == 0) {
                sum++;
            }
        }
        if (sum == 2) {
            System.out.println("PRIME");
        } else {
            System.out.println(sum);
        }
    }

    /**
     * A triple fibonacci is basically fibonacci but the next sequence is the sum of the previous 3 numbers
     * 1, 1, 1, 3, 5, 9...
     * The sequence starts with index 0
     * Input
     * The index of the triple fibonacci sequence
     * Output
     * The number from the triple fibonacci sequence
     */
    public void findTripleFibonacci() {
        Scanner in = new Scanner(System.in);
        int index = in.nextInt();
        Long aLong = createListOfTripleFibonacci(index).get(index);
        System.out.println(aLong);
    }

    public List<Long> createListOfTripleFibonacci(int number) {
        ArrayList<Long> objects = new ArrayList<>();
        objects.add(1l);
        objects.add(1l);
        objects.add(1l);
        for (int i = 3; i <= number; i++){
            long sum = objects.get(i-1) + objects.get(i-2) + objects.get(i-3);
            objects.add(sum);
        }
        return objects;
    }

}
