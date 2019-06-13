package topic.c.lambda;

class Dog {
    private String name;
    private DogQuerier dogQuerier;

    public Dog(String name) {
        this.name = name;
    }

    public Dog(DogQuerier dogQuerier, String name) {
        this(name);
        this.dogQuerier = dogQuerier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean executeOwnQuery() {
        return dogQuerier.test(this);
    }
}

@FunctionalInterface
interface DogQuerier {
    boolean test(Dog d);
}

public class LambdaEx1 {
    public static void main(String[] args) {
        // Traditional way with no lambda
        DogQuerier dogQuerier = new DogQuerier() {
            @Override
            public boolean test(Dog d) {
                return d.getName().contains("Kelvin");
            }
        };
        System.out.println("The dog is " + dogQuerier.test(new Dog("Kel")));

        // Lambda version
        DogQuerier dogQuerier1 = d -> d.getName().contains("Kelvin");
        System.out.println("The dog is " + dogQuerier1.test(new Dog("Kelvin")));

        // Passing Lambda as method parameter - V1
        Dog doc = new Dog(dogQuerier1, "Doc");
        System.out.println(doc.executeOwnQuery());

        // Passing Lambda as method parameter - V2
        Dog samuca = new Dog(s -> s.getName().contains("Samuca"), "Samuca");
        System.out.println(samuca.executeOwnQuery());

        int numCats = 3;
        DogQuerier dqWithCats = d -> {
            int numBalls = 1;
            numBalls++;
            System.out.println("Number of balls: " + numBalls);
            System.out.println("Number of cats: " + numCats);
            return !d.getName().isEmpty();
        };
        System.out.println(dqWithCats.test(new Dog("with cats")));
    }
}
