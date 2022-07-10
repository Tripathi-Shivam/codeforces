package problems_800;

import java.util.Scanner;

public class Boy_Or_Girl_236A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String userName = sc.nextLine();
		int count = 0;
		int[] arr = new int[26];
		
		for(int i = 0; i < userName.length(); i++) {
			arr[userName.charAt(i) - 97]++;
		}
		
		for(int i : arr) {
			if(i > 0)
				count++;
		}
		
		System.out.println((count % 2 == 0) ? "CHAT WITH HER!" : "IGNORE HIM!");
		
		sc.close();
	}

}
