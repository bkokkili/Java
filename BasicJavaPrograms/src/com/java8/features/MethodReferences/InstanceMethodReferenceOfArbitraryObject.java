package com.java8.features.MethodReferences;

import java.util.Arrays;
import java.util.List;

public class InstanceMethodReferenceOfArbitraryObject {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Method reference to the instance method of an arbitrary object
        names.forEach(System.out::println);
    }
}
