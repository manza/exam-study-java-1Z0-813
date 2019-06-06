package topic.a.language_enhancements;

public interface TestDefault {

    default int m1() {
        return 1;
    }

    public default void m2() {
    }

    void m3();
}
