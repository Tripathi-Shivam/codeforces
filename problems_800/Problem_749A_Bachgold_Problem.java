package problems_800;

import java.util.Scanner;

public class Problem_749A_Bachgold_Problem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
    	solve(sc.nextInt());
        
    	sc.close();
	}
	
	public static void solve(int k) {
		int n = k / 2;
		System.out.println(n);
		if((k & 1) == 0) {
			for(int i = 1; i <= n; i++)
				System.out.print(2 + " ");
		}
		else {
			for(int i = 1; i < n; i++)
				System.out.print(2 + " ");
			System.out.print(3);
		}
	}
}