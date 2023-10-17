package com.example.demo1.services;

import com.example.demo1.solutionW3Resource.SolutionForStreams;

import java.util.List;

import static java.util.Arrays.asList;

public class StreamOperationsService {
    public void performStreamOperations() {
        List<Integer> integerList = asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> colorList = asList("Red", "Green", "Blue", "Pink", "Brown");
        SolutionForStreams solutionForStreams = new SolutionForStreams();
        solutionForStreams.calculateSumOfEvenOrOddNumbers(integerList);
        solutionForStreams.countStringWithSpecificLetter(colorList, 'B');
        solutionForStreams.sortList(colorList);
        solutionForStreams.findMaxAndMin(integerList);
        solutionForStreams.findSecondMaxAndMin(integerList);
    }
}
