package topic.a.language_enhancements;

public class UsingUnderscoreLiterals {
    public static void main(String[] args) {
        long credit = 123_342_3_54L;
        long credit2 = 1_2_3L;
        double value = 1.23_2_3;
        long hexValue = 0x7fff_0101;

        System.out.println(credit);
        System.out.println(credit2);
        System.out.println(value);
        System.out.println(hexValue);
    }
}
