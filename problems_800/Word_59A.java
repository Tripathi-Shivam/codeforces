package problems_800;

import java.util.Scanner;

public class Word_59A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int lowercaseCount = 0;
		int uppercaseCount = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) - 97 < 0) 
				uppercaseCount++;
			else 
				lowercaseCount++;
		}
		
		System.out.println((uppercaseCount > lowercaseCount) ? s.toUpperCase() : s.toLowerCase());
		sc.close();
	}

}
