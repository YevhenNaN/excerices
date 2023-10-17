package com.example.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        ArrayList<Integer> objects = new ArrayList<>();
        for(int i = 0; i < 50; i++){
            objects.add(i);
        }
        List <String> colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
        SolutionForStreams solutionForStreams = new SolutionForStreams();
        solutionForStreams.calculateSumOfEvenOrOddNumbers(numbers);
        solutionForStreams.countStringWithSpecificLetter(colors, 'B');
        solutionForStreams.sortList(colors);
        solutionForStreams.findMaxAndMin(numbers);
        solutionForStreams.findSecondMaxAndMin(numbers);

    }

    public int sum(int number) {
        int sum = 0;
        for (int i = 2; i <= number; i++) {
            if (i % 2 == 0) {
                sum+=i;
            }
        }
        return sum;
    }

    public String compare(int bobTemp, int tomTemp) {
        if (bobTemp * 9/5 + 32 > tomTemp) {
            return "Higher";
        } else if(bobTemp * 9/5 + 32 == tomTemp) {
            return "Same";
        }
        return "Lower";
    }

    public static String myMethod(String url) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("accept", "application/json")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .timeout(Duration.ofSeconds(3))
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }


}
