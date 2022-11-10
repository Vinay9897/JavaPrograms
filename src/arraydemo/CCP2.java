import java.util.*;

public class CCP2 {
    // your code goes here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
            int maxi = 0;
            // int element = 0;
            for (int i = 0; i < n; i++) {
                hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
                if (hm.get(arr[i]) > maxi) {
                    maxi = hm.get(arr[i]);
                    // element = arr[i];
                }
            }
            if (maxi == n)
                System.out.println(0);
            else
                System.out.println(n - maxi);
            t--;
        }
        sc.close();
    }
}
