package problems_800;

import java.util.Scanner;

public class Problem_581A_Vasya_The_Hipster {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int count = Math.min(a, b);
		
		int max = Math.max((a - count) / 2, (b - count) / 2);
		
		System.out.println(count + " " + max);
		
		sc.close();
	}

}
