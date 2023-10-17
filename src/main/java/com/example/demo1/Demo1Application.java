package com.example.demo1;

import com.example.demo1.services.StreamOperationsService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
        StreamOperationsService streamOperationsService = new StreamOperationsService();
        streamOperationsService.performStreamOperations();
    }

}
