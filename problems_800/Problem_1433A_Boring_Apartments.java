package problems_800;

import java.util.Scanner;

public class Problem_1433A_Boring_Apartments {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		 
        sc.nextLine();
 
        for (int i = 0; i < testCases; i++) {
        	System.out.println(solve(sc.nextInt()));
        }
		
		sc.close();
	}
	
	public static int solve(int x) {
		int ans = ((x % 10) - 1) * 10;
		int temp = 1;
		while(x > 0) {
			ans += temp;
			temp++;
			x /=10;
		}
		
		return ans;
	}

}
