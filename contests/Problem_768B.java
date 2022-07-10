package contests;

import java.util.Scanner;

public class Problem_768B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		 
        sc.nextLine();
 
        for (int i = 0; i < testCases; i++) 
            solve(sc);
        
        sc.close();
	}
	
	public static void solve(Scanner sc) {
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n ; i++) 
			a[i] = sc.nextInt();
		
		int operations = 0;
		while(true) {
			int similar_suffix = 0;
			for(int i = n - 1; i >= 0; i--) {
				if(a[i] != a[n - 1]) {
					break;
				}
				similar_suffix = n - i;					
			}
			if(similar_suffix == n) {
				break;
			}
			for(int i = Math.max(0, n - 2 * similar_suffix); i < n; i++) {
				a[i] = a[n - 1];
			}
			operations++;
		}
		System.out.println(operations);
	}

}
