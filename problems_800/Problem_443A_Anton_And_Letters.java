package problems_800;

import java.util.Scanner;

public class Problem_443A_Anton_And_Letters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String set = sc.nextLine();
		
		set = set.substring(1, set.length() - 1);
		
		if(set.equals("")) {
			System.out.println(0);
			sc.close();
			return;
		}
		
		String[] letters = set.split(", ");
		
		int[] count = new int[26];
		
		for(int i = 0; i < letters.length; i++) {
			count[letters[i].charAt(0) - 97]++;
		}
		
		int distinctCount = 0;
		
		for(int i : count) {
			if(i > 0)
				distinctCount++;
		}
		
		System.out.println(distinctCount);
		
		sc.close();
	}

}
