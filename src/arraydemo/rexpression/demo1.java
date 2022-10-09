package rexpression;

import java.util.regex.*;

public class demo1 {
    public static void main(String[] args) {
        String pattern = "[a-z]+";
        String str = "Happy Learning! Vinay ";
        Pattern p = Pattern.compile(pattern);
        Matcher match = p.matcher(str);
        while (match.find()) {
            System.out.println(str.substring(match.start(), match.end()));
        }
    }
}
