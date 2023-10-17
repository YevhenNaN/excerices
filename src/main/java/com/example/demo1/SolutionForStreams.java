package com.example.demo1;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Solutions for w3resource.com streams
 * <a href="https://www.w3resource.com/java-exercises/stream/index.php">...</a>
 */
public class SolutionForStreams {

    public double calculateAvgOfNumbers(List<Integer> numbers) {
        return numbers.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
    }

    public void convertToUpperCase(List<String> strings){
        List<String> upperCaseList = strings.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println(upperCaseList);

        List<String> lowerCaseList = strings.stream()
                .map(String::toLowerCase)
                .toList();

        System.out.println(lowerCaseList);
    }

    public void calculateSumOfEvenOrOddNumbers(List<Integer> numbers) {
        double sumOfEvenNumbers = numbers.stream()
                .filter(a -> a % 2 == 0)
                .reduce(0, Integer::sum);
        System.out.println(sumOfEvenNumbers);

        double sumOfOddNumbers = numbers.stream()
                .filter(a -> a % 2 == 1)
                .reduce(0, Integer::sum);

        System.out.println(sumOfOddNumbers);
    }

    public void removeAllDuplicates(List<Objects> objects) {
        List<Objects> listWithoutDuplicates = objects.stream()
                .distinct()
                .toList();

        System.out.println(listWithoutDuplicates);
    }

    public void countStringWithSpecificLetter(List<String> strings, char specificLetter) {
        int count = (int) strings.stream()
                .filter(a -> a.startsWith(String.valueOf(specificLetter)))
                .count();

        System.out.println(count);
    }

    public void sortList(List<String> strings){
        List<String> alphabeticalAscending = strings.stream()
                .sorted()
                .toList();
        System.out.println(alphabeticalAscending);

        List<String> alphabeticalDescending = strings.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println(alphabeticalDescending);
    }

    public void findMaxAndMin(List<Integer> integers){
        Integer max = integers.stream().max(Integer::compareTo).orElse(null);
        System.out.println(max);

        Integer min = integers.stream().min(Integer::compareTo).orElse(null);
        System.out.println(min);
    }

    public void findSecondMaxAndMin(List<Integer> integers){
        Integer max = integers.stream()
                .sorted()
                .skip(1L)
                .findFirst()
                .orElse(null);

        System.out.println(max);

        Integer min = integers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1L)
                .findFirst()
                .orElse(null);
        System.out.println(min);
    }


}
