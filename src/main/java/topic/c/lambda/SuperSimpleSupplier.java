package topic.c.lambda;

import java.util.Map;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class SuperSimpleSupplier {
    public static void main(String[] args) {

        // Lambda
        Supplier<Integer> answerSupplier = () -> 42;
        System.out.println("Answer to everything: " + answerSupplier.get());

        LongSupplier longSupplier = () -> 12L;
        System.out.println(longSupplier.getAsLong());

        // Inner class old fashioned way
        Supplier<Integer> myIntSupplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 50;
            }
        };
        System.out.println("My old fashioned Supplier use is: " + myIntSupplier.get());

        // More interesting Supplier
        Supplier<String> userSupplier = () -> {
            Map<String, String> env = System.getenv();
            for(String prop : env.keySet()) {
                System.out.println(env + " : " + env.get(prop));
            }
            return env.get("USER");
        };
        System.out.println(userSupplier.get());

    }
}
