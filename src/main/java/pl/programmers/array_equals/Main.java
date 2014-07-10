package pl.programmers.array_equals;

import org.apache.commons.lang.ArrayUtils;

import java.util.Arrays;

/**
 * Author: Daniel
 */
public class Main {
    public static void main(String[] args) {
        oneDimension();
        twoDimension();
        threeDimension();
    }

    private static void oneDimension() {
        int[] tab1 = {1, 2};
        int[] tab2 = {1, 2};

        System.out.println("One dimension:");
        System.out.println("tab1 = " + Arrays.toString(tab1));
        System.out.println("tab2 = " + Arrays.toString(tab2));
        System.out.println("tab1 == tab2 ? " + (tab1 == tab2));
        System.out.println("tab1.equals(tab2) ? " + (tab1.equals(tab2)));
        System.out.println("Arrays.equals(tab1, tab2) ? " + (Arrays.equals(tab1, tab2)));
        System.out.println("Arrays.equals(tab1, tab2) ? " + ArrayUtils.isEquals(tab1, tab2));
        System.out.println();
    }

    private static void twoDimension() {
        int[][] tab1 = {{1, 2}, {3, 4}};
        int[][] tab2 = {{1, 2}, {3, 4}};

        System.out.println("Multi dimension:");
        System.out.println("tab1 = " + Arrays.deepToString(tab1));
        System.out.println("tab2 = " + Arrays.deepToString(tab2));
        System.out.println("tab1 == tab2 ? " + (tab1 == tab2));
        System.out.println("tab1.equals(tab2) ? " + (tab1.equals(tab2)));
        System.out.println("Arrays.equals(tab1, tab2 ? " + (Arrays.equals(tab1, tab2)));
        System.out.println("Arrays.equals(tab1, tab2 ? " + ArrayUtils.isEquals(tab1, tab2));
        System.out.println();
    }

    private static void threeDimension() {
        int[][][] tab1 =
                        {{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
                        {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}},
                        {{19, 20, 21}, {22, 23, 24}, {25, 26, 27}}};
        int[][][] tab2 =
                        {{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
                        {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}},
                        {{19, 20, 21}, {22, 23, 24}, {25, 26, 27}}};

        System.out.println("Multi dimension:");
        System.out.println("tab1 = " + Arrays.deepToString(tab1));
        System.out.println("tab2 = " + Arrays.deepToString(tab2));
        System.out.println("tab1 == tab2 ? " + (tab1 == tab2));
        System.out.println("tab1.equals(tab2) ? " + (tab1.equals(tab2)));
        System.out.println("Arrays.equals(tab1, tab2 ? " + (Arrays.equals(tab1, tab2)));
        System.out.println("Arrays.equals(tab1, tab2 ? " + ArrayUtils.isEquals(tab1, tab2));
        System.out.println();
    }
}
