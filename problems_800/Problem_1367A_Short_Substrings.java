package problems_800;

import java.util.Scanner;

public class Problem_1367A_Short_Substrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		 
        sc.nextLine();
 
        for (int i = 0; i < testCases; i++) {
        	solve(sc.nextLine());
        }
		
		sc.close();
	}

	public static void solve(String b) {
		if(b.length() == 2) {
			System.out.println(b);
			return;
		}
		StringBuilder a = new StringBuilder();
		a.append(b.substring(0, 2));
		for(int i = 3; i < b.length(); i += 2) {
			a.append(b.charAt(i));
		}
		System.out.println(a.toString());
	}
}
