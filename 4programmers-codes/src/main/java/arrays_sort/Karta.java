package arrays_sort;

/**
 * Author: Daniel
 */
public class Karta {
    private int numer;

    public Karta(int numer) {
        this.numer = numer;
    }

    public int getNumer() {
        return numer;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Karta{");
        sb.append("numer=").append(numer);
        sb.append('}');
        return sb.toString();
    }
}
