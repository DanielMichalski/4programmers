package array_equals;

import org.apache.commons.lang.ArrayUtils;

import java.util.Arrays;

/**
 * Author: Daniel
 */
public class Main {
    public static void main(String[] args) {
        oneDimension();
        multiDimension();
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
    }

    private static void multiDimension() {
        int[][] tab1 = {{1, 2}, {3, 4}};
        int[][] tab2 = {{1, 2}, {3, 4}};

        System.out.println("Multi dimension:");
        System.out.println("tab1 = " + Arrays.deepToString(tab1));
        System.out.println("tab2 = " + Arrays.deepToString(tab2));
        System.out.println("tab1 == tab2 ? " + (tab1 == tab2));
        System.out.println("tab1.equals(tab2) ? " + (tab1.equals(tab2)));
        System.out.println("Arrays.equals(tab1, tab2 ? " + (Arrays.equals(tab1, tab2)));
        System.out.println("Arrays.equals(tab1, tab2 ? " + ArrayUtils.isEquals(tab1, tab2));
    }
}
