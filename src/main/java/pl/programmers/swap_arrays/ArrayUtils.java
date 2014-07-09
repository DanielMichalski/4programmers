package pl.programmers.swap_arrays;

/**
 * Author: Daniel
 */
public class ArrayUtils {
    public static int[] swapTab(int[] tab) {
        int[] tabAfterSwap = new int[tab.length];

        for (int i = 0; i < tab.length; i++) {
            tabAfterSwap[i] = tab[tab.length - 1 - i];
        }

        return tabAfterSwap;
    }

    public static int[] reverseArray(int[] array)
    {
        for (int i=0; i < array.length / 2; i++)
        {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}
