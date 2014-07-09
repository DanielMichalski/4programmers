package pl.programmers.liczby_z_pliku;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Author: Daniel
 */
public class LiczbyZPlikuTest {
    public static void main(String[] args)
            throws FileNotFoundException {

        List<Integer> lista = new ArrayList<Integer>();
        Scanner odczyt = new Scanner(new File("C:/Temp/Liczby.txt"));

        // zczytywanie elementów
        while(odczyt.hasNextLine()){
            int liczba = odczyt.nextInt();
            lista.add(liczba);
        }

        // wypisywanie elementów
        for(int x : lista){
            System.out.print(x + " ");
        }

        System.out.println();

        Integer max = Collections.max(lista);
        System.out.println(max);

        int i = 0;
        for (Integer liczba : lista) {
            if (liczba.equals(max)) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
