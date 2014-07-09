package pl.programmers.swap_arrays;

/**
 * Author: Daniel
 */
public class Main {
    public static void main(String[] args) {
        int[] tab = {-2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        System.out.print("before: ");
        for (int i : tab) {
            System.out.print(i + " ");
        }

        int[] tabeAfterSwap = ArrayUtils.reverseArray(tab);

        System.out.println();

        System.out.print("after: ");
        for (int i : tabeAfterSwap) {
            System.out.print(i + " ");
        }
    }
}
