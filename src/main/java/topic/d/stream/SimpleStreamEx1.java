package topic.d.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class SimpleStreamEx1 {
    public static void main(String[] args) {

        // Stream 'count'
        Integer[] myNums = {1, 2, 3};
        Stream<Integer> myStream = Arrays.stream(myNums);
        long numElements = myStream.count(); // terminal operation
        System.out.println("Number of elements: " + numElements);

        // Using Intermediate operations
        Stream<Integer> myStream2 = Arrays.stream(myNums);
        long numElementsWhereNumBiggerThanOne = myStream2
                .filter(i -> i > 1)
                .count();
        System.out.println("Result: " + numElementsWhereNumBiggerThanOne);

        // Stream from Collection
        List<Double> temps = Arrays.asList(28.2, 26.3, 22.2, 18.9, 16.0, 11.0, 8.2);
        System.out.println("Number of days over 25C: " + temps.stream()
                .filter(temp -> temp > 25.0)
                .count());

        // Stream from Map
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("Boi", 6);
        myMap.put("Kelvin", 10);
        myMap.put("Puff", 7);
        System.out.println("Number of dogs older than 8 are : " + myMap
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 8)
                .count());

        // Creating a Stream with 'of' operator
        Stream<Integer> streamOfIntegers = Stream.of(myNums);
        System.out.println("Count: " + streamOfIntegers.count());

        Stream<String> streamOfVogals = Stream.of("a", "e", "i", "o", "u");
        streamOfVogals.forEach(System.out::print);

    }
}
