package pl.programmers.reversible;

/**
 * Author: Daniel
 */
public class Runner {
    public static void main(String[] args) {
        ReversibleDouble reversibleDouble = new ReversibleDouble();
        ReversibleString reversibleString = new ReversibleString();

        double normal = 2.0;
        System.out.println("normal = " + normal);
        double reversed = reversibleDouble.reverse(normal);
        System.out.println("reversed = " + reversed);
        normal = reversibleDouble.reverse(reversed);
        System.out.println("normal = " + normal);

        String normalString = "Cat";
        System.out.println("normalString = " + normalString);
        String reversedString = reversibleString.reverse(normalString);
        System.out.println("reversedString = " + reversedString);
        normalString = reversibleString.reverse(reversedString);
        System.out.println("normalString = " + normalString);
    }
}
