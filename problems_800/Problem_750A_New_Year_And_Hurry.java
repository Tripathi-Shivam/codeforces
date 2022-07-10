package problems_800;

import java.util.Scanner;

public class Problem_750A_New_Year_And_Hurry {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int total = 0;
		int count = 0;
		for(int i = 1; i <= n; i++) {
			total += (5  * i);
			if(total + k <= 240) {
				count++;
			}
		}
		
		System.out.println(count);
		
		sc.close();
	}

}
