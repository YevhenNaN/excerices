package com.example.demo1.solutionW3Resource.codin_game_exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class SolutionForBattles {

    private static Random random = new Random();  // Compliant


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter any text: ");

        String text = sc.nextLine();
        int amountOfWords = getWordsAmount(text);

        System.out.println("Amount of words in your text: " + amountOfWords);
    }

    private static int getWordsAmount(String text) {
        String[] arrayOfString = text.split(" ");
        return arrayOfString.length;
    }

    public static String firstCharToTitleCase(String string) {
        String lowerCase = string.toLowerCase();
        String[] split = lowerCase.split(" ");
        String string1 = Arrays.toString(Arrays.stream(split).map(s -> s.substring(0, 1).toUpperCase() + s.substring(1)).toArray());
        return string1.replaceAll(",", "");
    }

    public static String[] filterWordsByLength(int minLength, String[] words) {
		return (String[]) Arrays.stream(words).filter(word -> word.length() > minLength).toArray();
    }

    int calculateAmountOfWords(String[] words) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter any text: ");
        String[] split = sc.nextLine().split(" ");
        return split.length;
    }

    public static void drawRectangle(int height, int width) {
        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println(); // Move to the next line

        // Draw sides
        for (int i = 0; i < height - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < width - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        // Draw bottom border
        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println(); // Move to the next line
    }

    public static int[] generateRandomArray(int amountOfElements) {
        Random random = new Random();
        int[] array = new int[amountOfElements];
        for (int i = 0; i < amountOfElements; i++) {
            array[i] = random.nextInt(100); // Assuming random integers between 0 and 99
        }
        return array;
    }

    public static int[] extendArray(int[] arr) {
        int[] ints = Arrays.copyOf(arr, arr.length * 2);
        for (int i = arr.length; i < ints.length;  i++) {
            ints[i] = arr[i - arr.length]*2;
        }
        return ints;
    }

    public static int gcdRecursive(int firstNumber, int secondNumber) {
        int length = Math.max(firstNumber, secondNumber);
        for (int i = length; i > 0; i--){
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                return i;
            }
        }
        return 1;
    }
    public static int sumDigitsInNumber(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10; //5 +
            number = number / 10;//13
        }
        return Math.abs(sum);
    }


    public static void rotate90(double[][] matrix) {
        int size = matrix.length;
        double[][] rotatedMatrix = new double[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                rotatedMatrix[j][size - 1 - i] = matrix[i][j];
            }
        }

        for (int i = 0; i < size; i++) {
            System.arraycopy(rotatedMatrix[i], 0, matrix[i], 0, size);
        }
    }

    public static void rotate180(double[][] matrix) {
        rotate90(matrix);
        rotate90(matrix);
    }

    public static void rotate270(double[][] matrix) {
        rotate90(matrix);
        rotate90(matrix);
        rotate90(matrix);
    }


    public int maxInt(int [] array) {
        if (array.length == 0) {
            return 0;
        }
        return Arrays.stream(array).max().getAsInt();
    }

    public int maxIntViaLoop(int [] array) {
        int[] ints = Arrays.copyOf(array, array.length);
        int maxInt = array[0];
        for(int i = 1; i < array.length; i++) {
            if (array[i] > maxInt) {
                maxInt = array[i];
            }
        }
        return maxInt;
    }

    public boolean containsDuplicate(int[] nums) {
        long count = Arrays.stream(nums).distinct().count();
        return nums.length == count;
    }

    public boolean isAnagram(String s, String t) {
        char[] charArray = s.toCharArray();
        char[] charArray1 = t.toCharArray();
        int sum = 0;
        if (s.length() == t.length()) {
            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < t.length(); j++) {
                    if (charArray[i] == charArray1[j]) {
                        charArray1[j] = '0';
                        sum++;
                        break;
                    }
                }
            }
        }
        return sum == s.length();
    }

    public boolean isAnagram1(String s, String t) {
        char[] charArray = s.toCharArray();
        char[] charArray1 = t.toCharArray();
        Arrays.sort(charArray);
        Arrays.sort(charArray1);
        int compare = Arrays.compare(charArray, charArray1);
        return 0 == compare;
    }

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
        for (int i = 1; i <= N; i++) {
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

    private List<Long> createListOfTripleFibonacci(int number) {
        ArrayList<Long> objects = new ArrayList<>();
        objects.add(1l);
        objects.add(1l);
        objects.add(1l);
        for (int i = 3; i <= number; i++) {
            long sum = objects.get(i - 1) + objects.get(i - 2) + objects.get(i - 3);
            objects.add(sum);
        }
        return objects;
    }

    public static String[] dirReduc(String[] arr) {
        Stack<String> stack = new Stack<>();

        for (String direction : arr) {
            if (!stack.isEmpty() && oppositeDirection(stack.peek(), direction)) {
                stack.pop(); // cancel out opposite directions
            } else {
                stack.push(direction); // push non-opposite directions onto the stack
            }
        }

        return stack.toArray(new String[0]);
    }

    private static boolean oppositeDirection(String dir1, String dir2) {
        return (dir1.equals("NORTH") && dir2.equals("SOUTH")) ||
                (dir1.equals("SOUTH") && dir2.equals("NORTH")) ||
                (dir1.equals("EAST") && dir2.equals("WEST")) ||
                (dir1.equals("WEST") && dir2.equals("EAST"));
    }

    public static String print(int size) {
        if (size % 2 == 0 || size <= 0) {
            return null;
        }

        StringBuilder diamond = new StringBuilder();
        for (int i = 0; i < size; i++) {
            int spaces = Math.abs(size / 2 - i);
            int stars = size - 2 * spaces;
            diamond.append(" ".repeat(spaces)).append("*".repeat(stars)).append("\n");
        }
        return diamond.toString();
    }

    public static void printLadderGorFireman(int size) {
        Scanner in = new Scanner(System.in);
        int floor = in.nextInt();
        for (int i = 0; i < floor; i++) {
            System.out.print("#  #\n####\n");
        }
        System.out.println("#  #\n");
    }

    public void parseFromHexToDecimal() {
        Scanner in = new Scanner(System.in);
        String number = in.next();

        int decimal = Integer.parseInt(number, 16);

        System.out.println(decimal);
    }

    public void parseFromHexToDecima1l() {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int h = in.nextInt();
        int r = in.nextInt();
        String s = p * h > r ? "YES" : p * h == r ? "BARELY" : "NO";
        System.out.println(s);

    }

}
