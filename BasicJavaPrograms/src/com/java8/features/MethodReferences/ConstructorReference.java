package com.java8.features.MethodReferences;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public class ConstructorReference {
    public static void main(String[] args) {
        // Constructor reference for no-argument constructor
        Supplier<Car> carSupplier = Car::new;

        // Create a new Car object using the constructor reference
        Car car = carSupplier.get();

        System.out.println(car);

        // Constructor reference for argument constructor
        BiFunction<String, Integer, Person> personCreator = Person::new;

        // Create a new Person object using the constructor reference
        Person person = personCreator.apply("Alice", 30);

        // Print the person details
        System.out.println(person);
    }

}

class Car {
    private final String model;

    // No-argument constructor
    public Car() {
        this.model = "Grand Vitara";
    }

    public Car(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return model;
    }
}

class Person {
    private final String name;
    private final int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}




