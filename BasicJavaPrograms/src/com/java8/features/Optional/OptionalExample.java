package com.java8.features.Optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        //Basic Null check using Optional class
        String[] str = new String[4];
        Optional<String> checkNull = Optional.ofNullable(str[2]);
        if (checkNull.isPresent()){
            String word = str[2].toLowerCase();
            System.out.print(word);
        }else{
            System.out.println("String is Empty");
        }
        System.out.println("********************************");
        Person person1 = new Person("Alice", "New York");
        Person person2 = new Person("Bob", null);
        Person person3 = new Person("Charlie", "San Francisco");
        Person person4 = new Person(null, "Missouri");

        List<Person> people = Arrays.asList(person1, person2, person3, person4);

        for (Person person : people){

            if(Optional.ofNullable(person.getName()).isPresent())
            {
                if(Optional.ofNullable(person.getCity()).isPresent())
                {
                    System.out.println(person.getName() + " lives in " + person.getCity().toUpperCase());
                }
            }

        }
        System.out.println("********************************");
        for (Person person : people){
            Optional.ofNullable(person.getCity()).map(String :: toLowerCase).ifPresent(
                    city -> System.out.println(person.getName() + " lives in " + person.getCity().toUpperCase())
            );
        }

        System.out.println("********************************");
        for (Person person : people){
            Optional.ofNullable(person.getName())
                    .flatMap(name -> Optional.ofNullable(person.getCity())
                            .map(city -> String.format("%s lives in %s", name, city.toUpperCase()))
                    )
                    .ifPresent(System.out::println);
        }

    }
}

class Person {
    private final String name;
    private final String city;

    public Person(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
}

