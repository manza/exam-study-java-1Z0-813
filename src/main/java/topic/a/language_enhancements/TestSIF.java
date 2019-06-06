package topic.a.language_enhancements;

interface StaticIFace {

    static int m1() {
        return 42;
    }

    public static void m2() {

    }
}

public class TestSIF implements StaticIFace {

    public static void main(String[] args) {
        System.out.println(StaticIFace.m1()); // legal interface name must be included

        new TestSIF().go();
        //System.out.println(m1()); // illegal: reference from interface is mandatory
    }

    void go() {
        System.out.println(StaticIFace.m1()); // also legal from instance
    }

}
