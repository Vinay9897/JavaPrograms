package araydemo;

import java.util.ArrayList;

public class findSubString {

    public static void main(String[] args) {
        ArrayList<String> st = new ArrayList<>();
        String str = "Vinay";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                st.add(str.substring(i, j));
            }
        }
        System.out.println(st);
    }

}
