package com.example.demo1;

import com.example.demo1.patterns.gof.creational_patterns.abstract_factory.AnimalAbstractFactory;
import com.example.demo1.patterns.gof.creational_patterns.abstract_factory.AnimalEra;
import com.example.demo1.patterns.gof.creational_patterns.abstract_factory.AnimalType;
import com.example.demo1.patterns.gof.creational_patterns.factory_method.CarFactory;
import com.example.demo1.patterns.gof.creational_patterns.factory_method.MotorVehicleFactory;
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
        new AnimalAbstractFactory().createAnimal(AnimalType.SKY, AnimalEra.CENOZOIC);
        MotorVehicleFactory motorVehicleFactory = new CarFactory();
        motorVehicleFactory.create();
    }

}
