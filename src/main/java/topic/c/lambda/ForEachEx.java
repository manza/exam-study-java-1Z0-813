package topic.c.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

class MyDog {
    private String name;
    private int age;
    private int weight;

    public MyDog(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void bark() {
        System.out.println("Bark Bark Bark ...");
    }
}

public class ForEachEx {
    public static void main(String[] args) {

        // Using simple Consumer -> ForEach
        List<String> dogNames = Arrays.asList("boi", "olover", "zooey");
        Consumer<String> printNames = name -> System.out.println(name);
        dogNames.forEach(printNames);
        dogNames.forEach(n -> System.out.println(n));

        // Using Bi Consumer -> ForEac
        Map<String, String> env = System.getenv();
        BiConsumer<String, String> printEnv = (key, value) -> System.out.println(key + " : " + value);
        env.forEach(printEnv);

        // Using 'andThen' from Consumer in order to compose Consumers
        List<MyDog> dogs = new ArrayList<>();
        MyDog kelvin = new MyDog("Kelvin", 9, 30);
        MyDog puff = new MyDog("Puff", 7, 10);
        dogs.add(kelvin); dogs.add(puff);

        Consumer<MyDog> displayName = dog -> System.out.println(dog.getName());
        Consumer<MyDog> bark = dog -> dog.bark();

        dogs.forEach(displayName.andThen(bark));
    }
}
