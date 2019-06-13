package topic.c.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateEx {
    public static void main(String[] args) {
        MyDog boi = new MyDog("Boi", 10, 6);
        MyDog clover = new MyDog("Clover", 5, 12);
        MyDog kelvin = new MyDog("Kelvin", 10, 12);

        Predicate<MyDog> predicate = dog -> dog.getAge() > 9;
        System.out.println("Is Boi older than 9? " + predicate.test(boi));
        System.out.println("Is Clover older than 9? " + predicate.test(clover));

        ArrayList<MyDog> dogs = new ArrayList<>();
        dogs.add(boi);
        dogs.add(clover);
        dogs.add(kelvin);

        System.out.println("Dogs younger than 9");
        printDogIf(dogs, d -> d.getAge() < 9);

        System.out.println("Dogs older than 9");
        printDogIf(dogs, d -> d.getAge() > 9);

        // Using Predicate method 'removeIf' that removes from List if test() == true
        System.out.println("--------------");
        Predicate<MyDog> findKs = dog -> dog.getName().toLowerCase().startsWith("k");
        dogs.removeIf(findKs);
        dogs.forEach(d -> System.out.println(d.getName()));

        // Using Bi Predicates with usage of 'and' to compose predicates
        BiPredicate<String, Integer> startsWithK = (name, age) -> name.toLowerCase().startsWith("k");
        BiPredicate<String, Integer> olderThan9 = (name, age) -> age >= 10;
        BiPredicate<String, Integer> isOldDogWithK = (name, age) -> startsWithK.and(olderThan9).test(name, age);
    }

    public static void printDogIf(ArrayList<MyDog> dogs, Predicate<MyDog> p) {
        dogs.forEach(dog -> {
            if (p.test(dog)) {
                System.out.println(dog.getName());
            }
        });
    }
}
