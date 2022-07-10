package problems_800;

import java.util.Scanner;

public class Program_520A_Pangram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		
		s = s.toLowerCase();
		
		int[] characterCount = new int[26];
		
		for(int i = 0; i < n; i++) {
			characterCount[s.charAt(i) - 97]++;
		}
		
		boolean isPangram = true;
		
		for(int i : characterCount) {
			if(i == 0)
				isPangram = false;
		}
		
		System.out.println(isPangram ? "YES" : "NO");
		
		sc.close();
	}

}
