package topic.c.lambda;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Function Functional Interface usage is basically to take a T argument as input and be able to return a different type
 */
public class FunctionEx {
    public static void main(String[] args) {
        Function<Integer, String> answer = a -> {
            if (a == 42) return "forty-two";
            else return "No answer for you";
        };
        System.out.println(answer.apply(42));
        System.out.println(answer.apply(18));

        // Bi Function example
        BiFunction<String, String, String> firstLast = (first, last) -> first + " | " + last;
        System.out.println("First and Last name: " + firstLast.apply("Joe", "Smith"));

        // Example of 'computeIfAbsent' and 'replaceAll'
        TreeMap<String, String> aprilWinner = new TreeMap<>();
        aprilWinner.put("April 2017", "Bob");
        aprilWinner.put("April 2016", "Annette");
        aprilWinner.put("April 2015", "Lamar");

        System.out.println("--- List, before checking Appril 2014");
        aprilWinner.forEach((k, v) -> System.out.println(k + " : " + v));

        // no key for 2014 and then it gets created
        aprilWinner.computeIfAbsent("April 2014", k -> "John Doe");
        aprilWinner.forEach((k, v) -> System.out.println(k + " : " + v));

        aprilWinner.replaceAll((key, oldValue) -> oldValue.toUpperCase());
        aprilWinner.forEach((k, v) -> System.out.println(k + " : " + v));

    }
}
