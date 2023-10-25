package com.example.demo1;

import com.example.demo1.patterns.gof.creational.abstract_factory.AnimalAbstractFactory;
import com.example.demo1.patterns.gof.creational.abstract_factory.AnimalEra;
import com.example.demo1.patterns.gof.creational.abstract_factory.AnimalType;
import com.example.demo1.patterns.gof.creational.builder.Person;
import com.example.demo1.patterns.gof.creational.factory_method.CarFactory;
import com.example.demo1.patterns.gof.creational.factory_method.MotorVehicleFactory;
import com.example.demo1.patterns.gof.creational.prototype.Employees;
import com.example.demo1.patterns.gof.creational.singleton.ClassSingleton;
import com.example.demo1.patterns.gof.creational.singleton.EnumSingleton;
import com.example.demo1.patterns.gof.structural.adapter.RoundHole;
import com.example.demo1.patterns.gof.structural.adapter.RoundPeg;
import com.example.demo1.patterns.gof.structural.adapter.SquarePeg;
import com.example.demo1.patterns.gof.structural.adapter.SquarePegAdapter;
import com.example.demo1.patterns.gof.structural.adapter.charger.SocketAdapter;
import com.example.demo1.patterns.gof.structural.adapter.charger.SocketClassAdapterImpl;
import com.example.demo1.patterns.gof.structural.adapter.charger.SocketObjectAdapterImpl;
import com.example.demo1.patterns.gof.structural.adapter.charger.Volt;
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
        creationPatternExamples();

        // Adapter
        // Round fits round, no surprise.
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        // hole.fits(smallSqPeg); // Won't compile.

        // Adapter solves the problem.
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }

        testClassAdapter();
        testObjectAdapter();
    }

    private static void creationPatternExamples() {
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

        System.out.println("emps List: " + emps.getEmployeeList());
        System.out.println("empsNew List: " + list);
        System.out.println("empsNew1 List: " + list1);
    }

    private static void testObjectAdapter() {
        SocketAdapter sockAdapter = new SocketObjectAdapterImpl();
        Volt v3 = getVolt(sockAdapter, 3);
        Volt v12 = getVolt(sockAdapter, 12);
        Volt v120 = getVolt(sockAdapter, 120);
        System.out.println("v3 volts using Object Adapter=" + v3.getVolts());
        System.out.println("v12 volts using Object Adapter=" + v12.getVolts());
        System.out.println("v120 volts using Object Adapter=" + v120.getVolts());
    }

    private static void testClassAdapter() {
        SocketAdapter sockAdapter = new SocketClassAdapterImpl();
        Volt v3 = getVolt(sockAdapter, 3);
        Volt v12 = getVolt(sockAdapter, 12);
        Volt v120 = getVolt(sockAdapter, 120);
        System.out.println("v3 volts using Class Adapter=" + v3.getVolts());
        System.out.println("v12 volts using Class Adapter=" + v12.getVolts());
        System.out.println("v120 volts using Class Adapter=" + v120.getVolts());
    }

    private static Volt getVolt(SocketAdapter sockAdapter, int i) {
        return switch (i) {
            case 3 -> sockAdapter.get3Volt();
            case 12 -> sockAdapter.get12Volt();
            default -> sockAdapter.get120Volt();
        };
    }

}
