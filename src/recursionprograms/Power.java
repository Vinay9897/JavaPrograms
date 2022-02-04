package recursionprograms;

public class Power {
    public static int num1 = 1;

    public static void printPower(int num, int power) {
        while (power > 0) {
            if ((power % 2) == 0) {
                num1 = num1 * num;
                power = power / 2;
            }
            num1 = num1 * 2;
        }
        System.out.println(num1);
    }

    public static void main(String[] args) {
        int num = 2;
        int power = 6;
        // System.out.print(printPower(num, power));
        printPower(num, power);

    }

}
