package recursionprograms;

public class PrintNumbers {

    public static void increasingOrder(int num) {
        if (num < 1) {
            return;
        }
        System.out.println(num);
        increasingOrder(num - 1);

    }

    public static void main(String[] args) {
        int num = 5;
        increasingOrder(num);

    }
}
