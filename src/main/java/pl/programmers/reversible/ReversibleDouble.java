package pl.programmers.reversible;

/**
 * Author: Daniel
 */
public class ReversibleDouble implements Reversible<Double> {

    @Override
    public Double reverse(Double value) {
        return 1/ value;
    }

}
