package problems_900;

import java.util.Scanner;

public class Problem_133A_HQ9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(solve(sc));
		
		sc.close();
	}

	public static String solve(Scanner sc) {
		char[] a = sc.nextLine().toCharArray();
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] == 'H' || a[i] == 'Q' || a[i] == '9') 
				return "YES";
		}
		
		return "NO";
	}
}
