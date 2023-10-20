package com.example.demo1;

import com.example.demo1.patterns.gof.creational_patterns.abstract_factory.AnimalAbstractFactory;
import com.example.demo1.patterns.gof.creational_patterns.abstract_factory.AnimalEra;
import com.example.demo1.patterns.gof.creational_patterns.abstract_factory.AnimalType;
import com.example.demo1.patterns.gof.creational_patterns.builder.Person;
import com.example.demo1.patterns.gof.creational_patterns.factory_method.CarFactory;
import com.example.demo1.patterns.gof.creational_patterns.factory_method.MotorVehicleFactory;
import com.example.demo1.patterns.gof.creational_patterns.prototype.Employees;
import com.example.demo1.patterns.gof.creational_patterns.singleton.ClassSingleton;
import com.example.demo1.patterns.gof.creational_patterns.singleton.EnumSingleton;
import com.example.demo1.services.StreamOperationsService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.List;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
        StreamOperationsService streamOperationsService = new StreamOperationsService();
        streamOperationsService.performStreamOperations();
        //abstract factory
        new AnimalAbstractFactory().createAnimal(AnimalType.SKY, AnimalEra.CENOZOIC);
        //Factory method
        MotorVehicleFactory motorVehicleFactory = new CarFactory();
        motorVehicleFactory.create();
        //builder
        Person myPerson = new Person.PersonBuilder()
                .withName("Jane")
                .withHeight(165)
                .withWeight(70)
                .build();
        System.out.println(myPerson.toString());

        //Singleton
        ClassSingleton classSingleton1 = ClassSingleton.getInstance();
        System.out.println(classSingleton1.getInfo());
        ClassSingleton classSingleton2 = ClassSingleton.getInstance();
        classSingleton2.setInfo("Last info class");
        System.out.println(classSingleton2.getInfo());
        System.out.println(classSingleton1.getInfo());
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE.getInstance();
        System.out.println(enumSingleton.getInfo());
        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE.getInstance();
        enumSingleton1.setInfo("Last info class");
        System.out.println(enumSingleton1.getInfo());
        System.out.println(enumSingleton.getInfo());

        //Prototype

        Employees emps = new Employees();
        emps.loadData();

        //Use the clone method to get the Employee object
        Employees empsNew = (Employees) emps.clone();
        Employees empsNew1 = (Employees) emps.clone();
        List<String> list = empsNew.getEmployeeList();
        list.add("John");
        List<String> list1 = empsNew1.getEmployeeList();
        list1.remove("Pankaj");

        System.out.println("emps List: "+emps.getEmployeeList());
        System.out.println("empsNew List: "+list);
        System.out.println("empsNew1 List: "+list1);

    }

}
