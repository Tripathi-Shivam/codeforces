package problems_900;

import java.util.Scanner;

public class Problem_96A_Football {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] a = sc.nextLine().toCharArray();
		System.out.println(solve(a));
		
		sc.close();
	}

	public static String solve(char[] a) {
		int countZero = 0, countOne = 0, n = a.length;
		
		for(int i = 0; i < n; i++) {
			if(a[i] == '0') {
				countOne = 0;
				countZero++;
				if(countZero == 7) {
					return "YES";
				}
			}
			else {
				countZero = 0;
				countOne++;
				if(countOne == 7) {
					return "YES";
				}
			}
//			System.out.println(countZero + " " + countOne);
		}
		
		return "NO";
	}
}
