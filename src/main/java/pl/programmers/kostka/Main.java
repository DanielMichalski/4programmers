package pl.programmers.kostka;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Kostka kostka = new Kostka();
        int[][] rzuty = kostka.rzucKostka(2, 3, 6);

        System.out.println(Arrays.deepToString(rzuty));
    }
}
