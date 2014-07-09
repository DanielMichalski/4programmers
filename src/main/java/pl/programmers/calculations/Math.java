package pl.programmers.calculations;
/**
 * Author: Daniel
 */
public class Math {
    public static long pow(long x, long n) {
        if (n == 0) return 1;

        if (n % 2 != 0) {
            return x * pow(x, n - 1);
        } else {
            long a = pow(x, n/2);
            return a * a;
        }
    }
}
