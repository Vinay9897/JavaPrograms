package rexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class dem02 {
    public static void main(String[] args) {
        // String pattern = "[^0-9a-z@.]";
        // String pattern = "vinay";
        String pattern = "a*";
        String str = "vinAyyadav91190@gmail.com";
        Pattern p = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = p.matcher(str);
        while (matcher.find()) {
            System.out.print(str.substring(matcher.start(), matcher.end()));
            // System.out.print(" " + matcher.start() + " " + matcher.end());
        }

    }

}
