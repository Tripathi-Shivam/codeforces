package problems_800;

import java.util.Scanner;

public class Problem_1560A_Dislike_Of_Threes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		 
        sc.nextLine();
 
        for (int i = 0; i < testCases; i++) {
        	System.out.println(solve(sc.nextInt()));
        }
        
        sc.close();
	}

	public static int solve(int k) {
		int ans = 1;
		while(k > 0) {
			if(ans % 3 != 0 && ans % 10 != 3) {
				k--;
			}
			if(k > 0)
				ans++;
		}
		
		return ans;
	}
}