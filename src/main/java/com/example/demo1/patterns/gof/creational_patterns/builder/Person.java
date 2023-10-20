package com.example.demo1.patterns.gof.creational_patterns.builder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

/**
 * Builder pattern was introduced to solve some of the problems with Factory and Abstract Factory design patterns when the
 * Object contains a lot of attributes. There are three major issues with Factory and Abstract Factory design patterns
 * when the Object contains a lot of attributes.
 *
 * Too Many arguments to pass from client program to the Factory class that can be error-prone because most of the time,
 * the type of arguments are same and from client side its hard to maintain the order of the argument.
 * Some of the parameters might be optional but in Factory pattern,
 * we are forced to send all the parameters and optional parameters need to send as NULL.
 * If the object is heavy and its creation is complex, then all that complexity will be part of Factory classes that is confusing.
 */
@Getter
@Setter
@ToString
public class Person {

    private String name;
    private String surname;
    private int age;
    private int height;
    private int weight;
    private Set<Person> parents;

    public static class PersonBuilder {
        private final Person newPerson;

        public PersonBuilder() {
            newPerson = new Person();
        }

        public PersonBuilder withName(String name) {
            newPerson.name = name;
            return this;
        }

        public PersonBuilder withSurname(String surname) {
            newPerson.surname = surname;
            return this;
        }

        public PersonBuilder withAge(int age) {
            newPerson.age = age;
            return this;
        }

        public PersonBuilder withHeight(int height) {
            newPerson.height = height;
            return this;
        }

        public PersonBuilder withWeight(int weight) {
            newPerson.weight = weight;
            return this;
        }

        public PersonBuilder withParents(Set<Person> parents) {
            newPerson.parents = parents;
            return this;
        }

        public Person build() {
            return newPerson;
        }

    }
}
