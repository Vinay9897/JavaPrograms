import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
public class CPP3 {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            HashMap<Integer, Integer> hm = new HashMap<>();
            Integer[] arr = new Integer[2 * n];
            int flag = 0;
            for (int i = 0; i < 2 * n; i++) {
                arr[i] = sc.nextInt();
                hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
                if (hm.get(arr[i]) > 2) {
                    System.out.println("No");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                System.out.println("Yes");
            t--;
        }
        sc.close();
    }
}
