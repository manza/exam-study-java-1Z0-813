package topic.a.language_enhancements;

interface A {
    default void sayHello() {
        System.out.println("Hello");
    }
}

public class InterfaceTests implements A {
    public static void main(String[] args) {
        new InterfaceTests().sayHello();
    }

}
