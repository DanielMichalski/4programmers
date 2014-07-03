package arrays_sort;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Author: Daniel
 */
public class Runner {
    public static void main(String[] args) {
        String fname = System.getProperty("user.home") + "/Test/pakiety.txt";

        int rozmiarPierwPak;

        int przestrzenDyskowa;

        int przestrzenDyskowaWBajtach;

        int suma = 0;

        ArrayList<Integer> rozmPakList = new ArrayList<Integer>();

        int licznik = 1;

        try {
            File file = new File(fname);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String wierszZmiennych = bufferedReader.readLine();
            StringTokenizer tokanizer = new StringTokenizer(wierszZmiennych," ");

            rozmiarPierwPak = Integer.parseInt(tokanizer.nextToken());
            przestrzenDyskowa = Integer.parseInt(tokanizer.nextToken());

            przestrzenDyskowaWBajtach = przestrzenDyskowa * 1024 * 1024;

            // jesli nie poprawne dane
            if (rozmiarPierwPak < 0 || przestrzenDyskowa < 0)
                throw new Exception();


            while (suma < przestrzenDyskowaWBajtach) {
                if (licznik == 1) {
                    rozmPakList.add(rozmiarPierwPak);
                    suma += rozmiarPierwPak;
                }
                if(licznik > 1 && licznik < 6) {
                    rozmPakList.add(rozmPakList.get(rozmPakList.size() - 1) * 2);
                    suma += rozmPakList.get(rozmPakList.size() - 1);
                }
                if (licznik >= 6) {
                    rozmPakList.add(rozmPakList.get(rozmPakList.size() - 1) * 3);
                    suma += rozmPakList.get(rozmPakList.size() - 1);
                }
                licznik++;
            }

            suma -= rozmPakList.get(rozmPakList.size() - 1);
            rozmPakList.remove(rozmPakList.size() - 1);


            // wyświetlenie pierwszego wiersza
            System.out.println(rozmPakList.size());

            // wyswietlenie numerów pakietów oraz ich wielkości
            int i = 1;
            for (int list : rozmPakList) {
                System.out.println(i + " " + list);
                i++;
            }

            // Wyświetlenie sumy pakietów
            System.out.println(suma);

        } catch (Exception e) {
            System.out.println("***");
            System.exit(1);
        }
    }
}
