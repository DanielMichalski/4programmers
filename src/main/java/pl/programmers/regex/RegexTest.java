package pl.programmers.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Author: Daniel
 */
public class RegexTest {

    public static void main(String[] args) {
        final String text = " czy ala ma kota?";
        Pattern pattern = Pattern.compile("ala");
        final Matcher matcher = pattern.matcher(text);
        if(matcher.find()){
            System.out.println(text.substring(matcher.end()).trim());
        }

    }
}
