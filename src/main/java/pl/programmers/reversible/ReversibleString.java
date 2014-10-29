package pl.programmers.reversible;

/**
 * Author: Daniel
 */
public class ReversibleString implements Reversible<String> {

    @Override
    public String reverse(String text) {
        if (text == null) return null;
        StringBuilder sb = new StringBuilder(text);
        return sb.reverse().toString();
    }
}
