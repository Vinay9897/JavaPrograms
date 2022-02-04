package arraydemo;

public class BubbleSort {

    public static void main(String[] args) {
        int[] b = { 2, 4, 5, 9, 5, 1, 5, 6, 7 };
        int len = b.length;
        int[] c = new int[len];
        c = methodBubbleSort(b, len);
        for (int i = 0; i < len; i++)
            System.out.print(c[i] + " ");
    }

    private static int[] methodBubbleSort(int[] b, int len) {

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (b[j + 1] > b[j]) {
                    int temp = b[j + 1];
                    b[j + 1] = b[j];
                    b[j] = temp;
                }
            }
        }
        return b;
    }

}
