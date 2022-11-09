package araydemo;

import java.util.*;

public class CodeChefProblem1 {
	public static void main(String[] args) throws java.lang.Exception {
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int n = sc.nextInt();
			String s = sc.next();
			int l = (n / 2) - 1;
			int l1 = l;
			int r = n - 1;
			boolean response = true;
			while (l >= 0 && r > l1) {
				System.out.print(l + " " + r + " ");
				if (s.charAt(l) != s.charAt(r)) {
					response = false;
					System.out.println("No");
					break;
				}
				l--;
				r--;
			}
			if (response == true)
				System.out.println("Yes");

			t--;
			sc.close();
		}
	}
}
