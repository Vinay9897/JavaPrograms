package infitq;

public class StringRotation {
    public static void main(String[] args) {
        String num = "123456";
        String num1 = "";
        int rotateBy = 3;
        String left = "";
        String right = "";
        int len = num.length();
        left = num.substring(0, rotateBy);
        right = num.substring(rotateBy, num.length());
        num1 = right + left;
        System.out.println(num1);
        int[] arr = new int[num.length()];

    }
}
