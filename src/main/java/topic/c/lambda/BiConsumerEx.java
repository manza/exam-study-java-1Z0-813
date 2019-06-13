package topic.c.lambda;

import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerEx {
    public static void main(String[] args) {
        //Map<String, String> env = System.getenv();
        BiConsumer<String, String> printEnv = (key, value) -> {
            System.out.println(key + " : " + value);
        };
        printEnv.accept("USERPROFILE", "ROMO");
    }
}
