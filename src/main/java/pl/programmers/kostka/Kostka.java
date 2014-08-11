package pl.programmers.kostka;

import java.util.Random;

public class Kostka {

    public int[][] rzucKostka(int ileKosci, int ileRzutow, int ileScian) {
        Random random = new Random();
        int[][] rzuty = new int[ileKosci][ileRzutow];

        for (int i = 0; i < ileKosci; i++) {
            for (int j = 0; j < ileRzutow; j++) {
                rzuty[i][j] = random.nextInt(ileScian) + 1;
            }
        }

        return rzuty;
    }
}

