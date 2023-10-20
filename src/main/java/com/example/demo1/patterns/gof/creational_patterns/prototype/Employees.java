package com.example.demo1.patterns.gof.creational_patterns.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * The Prototype pattern is generally used when we have an instance of the class (prototype) and we’d like to create new objects
 * by just copying the prototype.
 * Let’s use an analogy to better understand this pattern.
 * In some games, we want trees or buildings in the background.
 * We may realize that we don’t have to create new trees or buildings and render them on the screen every time the character moves.
 * So, we create an instance of the tree first. Then we can create as many trees as we want from this instance (prototype)
 * and update their positions. We may also choose to change the color of the trees for a new level in the game.
 * The Prototype pattern is quite similar. Instead of creating new objects, we just have to clone the prototypical instance.
 */

/**
 * If the object cloning was not provided, we will have to make database call to fetch the employee list every time.
 * Then do the manipulations that would have been resource and time-consuming. That’s all for prototype design pattern in java.
 */
public class Employees implements Cloneable {

    private final List<String> employeeList;

    public Employees() {
        employeeList = new ArrayList<>();
    }

    public Employees(List<String> list) {
        this.employeeList = list;
    }

    public void loadData() {
        //read all employees from database and put into the list
        employeeList.add("Pankaj");
        employeeList.add("Raj");
        employeeList.add("David");
        employeeList.add("Lisa");
    }

    public List<String> getEmployeeList() {
        return employeeList;
    }

    @Override
    public Object clone() {
        List<String> temp = new ArrayList<>(this.getEmployeeList());
        return new Employees(temp);
    }

}
