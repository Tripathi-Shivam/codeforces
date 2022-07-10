package problems_800;

import java.util.Scanner;

public class Problem_1512A_Spy_Detected {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		 
        sc.nextLine();
 
        for (int i = 0; i < testCases; i++) {
        	System.out.println(solve(sc));
        }
		
		sc.close();
	}
	
	public static int solve(Scanner sc) {
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int same, different = 0;
		if(a[0] == a[1]) {
			same = a[0];
		} 
		else if(a[0] == a[2]) {
			same = a[0];
			different = 1; 
			return different+1;
		}
		else {
			different = 0;
			same = a[1];
			return different+1;
		}
		
		for(int i = 2; i < n; i++) {
			if(a[i] != same) {
				different = i;
				break;
			}
		}
		
		return different+1;
	}
}
