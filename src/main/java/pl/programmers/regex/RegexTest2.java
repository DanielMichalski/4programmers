package pl.programmers.regex;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Author: Daniel
 */
public class RegexTest2 {
    public static void main(String[] args) {
        String pattern = "(?<!\\\\)\\|";
        String test1 = "a|b|c";
        String test2 = "a|b\\|c|d";
        System.out.println(Arrays.stream(test1.split(pattern)).collect(Collectors.joining(",")));
        System.out.println(Arrays.stream(test2.split(pattern)).collect(Collectors.joining(",")));
    }
}
