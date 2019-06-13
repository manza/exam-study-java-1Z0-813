package topic.c.lambda;

import java.util.function.Consumer;

enum Sex {
    MAN,
    WOMAN
};

public class ConsumerEx {
    public static void main(String[] args) {
        Consumer<Sex> yearsToWork = person -> {
            if (person.equals(Sex.MAN)) {
                System.out.println("65");
            }
            if (person.equals(Sex.WOMAN)) {
                System.out.println("60");
            }
        };

        yearsToWork.accept(Sex.MAN);
        yearsToWork.accept(Sex.WOMAN);
    }
}
