package com.java8.features.MethodReferences;

import java.util.function.Function;
import java.util.function.Predicate;

public class StaticMethodReferences {

    private static void java8Feature(){
        System.out.println("This is java 8 Feature");
    }

    private static  String getFeatureName(String featureName){
        return featureName;
    }

    private static boolean isThisJava8Feature(String feature){
        return "Stream API".equalsIgnoreCase(feature) ||
                "Lambda Expressions".equalsIgnoreCase(feature) ||
                "Default Methods".equalsIgnoreCase(feature) ||
                "Static_Method_Reference".equalsIgnoreCase(feature);
    }

    public static void main(String[] args) {
        Function<String,String> feature = StaticMethodReferences::getFeatureName;
        System.out.println(feature.apply("Static_Method_Reference"));

        Predicate<String> java8Feature = StaticMethodReferences::isThisJava8Feature;
        String feature1 = "Static_Method_Reference";
        String feature2 = "Collections Framework";
        System.out.println(feature1 + " is Java 8 feature: " + java8Feature.test(feature1));
        System.out.println(feature2 + " is Java 8 feature: " + java8Feature.test(feature2));

        Java8Feature java8Feature1 = StaticMethodReferences::java8Feature;
        java8Feature1.feature();
    }
}
