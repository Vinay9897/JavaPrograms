package recursionprograms;

public class Factorial {
    public static int num1 = 1;

    public static void pF(int num) {

        if (num == 0 || num == 1) {
            return;
        }
        num1 = num1 * num;

        pF(num - 1);
        System.out.println(num1);

    }

    public static void main(String[] args) {

        int num = 5;
        // System.out.println(pF(num));
        pF(num);

    }

}
