package czytany_wspak;

import java.util.Scanner;

/**
 * Author: Daniel
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj swoje imie: ");
        String imie = scanner.nextLine();

        System.out.println("Podane imie to: " + imie);

        System.out.print("Podane imie czytane wspak: ");
        for (int i = imie.length() - 1; i >= 0 ; i--) {
            System.out.print(imie.charAt(i));
        }

        System.out.println();
        System.out.print("Podane imie czytane wspak: (StringBuilder) ");
        StringBuilder stringBuilder = new StringBuilder(imie);
        System.out.println(stringBuilder.reverse());
    }
}
