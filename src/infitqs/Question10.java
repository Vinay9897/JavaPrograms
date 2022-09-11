package infitq;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Question10 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the how many input you want : ");
        int testcase = Integer.parseInt(br.readLine());
        while (testcase != 0) {
            System.out.print("Enter the size of the input");
            int n = Integer.parseInt(br.readLine());
            String str[] = br.readLine().split(" ");
            HashSet<String> hs = new HashSet<>();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                // System.out.println("Enter the value" );
                arr[i] = Integer.parseInt(str[i]);
            for (int i = 0; i < n; i++) {
                int sum = arr[i];
                if (sum % 2 != 0)
                    hs.add(arr[i] + " ");
                StringBuilder sb = new StringBuilder();
                sb.append(arr[i]);
                for (int j = i + 1; j < n; j++) {
                    sum += arr[j];
                    sb.append(arr[j]);
                    if (sum % 2 != 0)
                        hs.add(sb.toString());
                }
            }
            System.out.println(hs.size());
        }
    }
}
