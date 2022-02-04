package infitq;

public class UniqueString {
    public static void main(String[] args) {
        String str = "A@bcd1abx";
        int len = str.length();
        String unique = "";
        int[] count = new int[256];
        for (int i = 0; i < len; i++) {
            count[str.charAt(i)]++;
        }

        for (int i = 0; i < len; i++) {
            if (count[str.charAt(i)] == 1) {
                System.out.print(str.charAt(i));

            }

        }
        // System.out.println(unique);

    }

}