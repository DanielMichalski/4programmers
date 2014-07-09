package pl.programmers.class_test;

/**
 * Author: Daniel
 */
public class ClassTest {
    public static void main(String[] args) {
        new ClassTest();
    }

    public ClassTest() {
        System.out.println(test("tekst", String.class));
        System.out.println(test("tekst", Integer.class));
        System.out.println(test(4, String.class));
        System.out.println(test(4, Integer.class));
    }

    private <T> boolean test(T t, Class expectedClass) {
        return t.getClass() == expectedClass;
    }
}
