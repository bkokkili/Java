package com.java8.features.MethodReferences;

import java.util.function.Function;

public class InstanceMethodReferenceOfParticularObj {
    public static void main(String[] args) {
        // Create an instance of Greeting
        Greeting greetingInstance = new Greeting("Hello");

        // Create a method reference to the instance method greet
        Function<String, String> greeter = greetingInstance::greet;

        // Test the method reference
        String name = "Alice";
        String message = greeter.apply(name);

        // Print the result
        System.out.println(message); // Output: Hello, Alice!
    }

}

class Greeting{
    private final String greetingPrefix;

    // Constructor
    public Greeting(String greetingPrefix) {
        this.greetingPrefix = greetingPrefix;
    }

    // Instance method
    public String greet(String name) {
        return greetingPrefix + ", " + name + "!";
    }
}
