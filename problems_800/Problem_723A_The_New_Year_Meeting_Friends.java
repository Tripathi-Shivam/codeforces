package problems_800;

import java.util.Scanner;

public class Problem_723A_The_New_Year_Meeting_Friends {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt(), x2 = sc.nextInt(), x3 = sc.nextInt();
		int max = Math.max(Math.max(x1, x2), x3);
		int min = Math.min(Math.min(x1, x2), x3);
		
		System.out.println(max - min);
		
		sc.close();
	}

}
