package arrays_sort;

import java.util.Comparator;

/**
 * Author: Daniel
 */
public class Komparator implements Comparator<Karta> {
    @Override
    public int compare(Karta k1, Karta k2) {
        if(k2 == null) return -1;
        if(k1.getNumer() > k2.getNumer()) return 1;
        else if(k1.getNumer() < k2.getNumer()) return -1;
        else return 0;
    }
}
