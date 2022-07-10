package contests;

import java.util.Scanner;

public class Problem_Global_Round_19_B {

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
		int moves = 0;
		for(int i = 0; i < n; i++) 
			a[i] = sc.nextInt();
		
		
		for(int i = 1; i < n-1; i++) {
			if(a[i] == 0) {
				continue;
			}
			else if(a[i] % 2 == 0) {
				int k = n - 1;
				for(int j = i + 1; j < n - 1; j++) {
					if(a[j] % 2 != 0) {
						k = j;
						break;
					}
				}
				if(k != n - 1) {
					a[0]++;
					a[k]++;
					a[i] -= 2;
					moves++;
					if(a[i] == 2) {
						a[0]++;
						a[n-1]++;
						a[i] -= 2;
						moves++;
					}
					else {
						a[0] += a[i] / 2;
						a[n-1] += a[i] / 2;
						moves += a[i] / 2;
						a[i] = 0;
					}
				}
				else {
					if(a[i] == 2) {
						a[0]++;
						a[k]++;
						a[i] -= 2;
						moves++;
					}
					else {
						a[0] += a[i] / 2;
						a[k] += a[i] / 2;
						moves += a[i] / 2;
						a[i] = 0;
					}
				}
//				for(int z : a) 
//					System.out.print(z + " ");
//				System.out.println(moves);
			} 
			else {
				int k = n - 1;
				for(int j = i + 1; j < n - 1; j++) {
					if(a[j] % 2 == 0) {
						k = j;
						break;
					}
				}
				if(k != n - 1) {
					a[k] -= 2;
					a[i]++;
					a[n-1]++;
					moves++;
					if(a[i] == 2) {
						a[0]++;
						a[n-1]++;
						a[i] -= 2;
						moves++;
					}
					else {
						a[0] += a[i] / 2;
						a[n-1] += a[i] / 2;
						moves += a[i] / 2;
						a[i] = 0;
					}
				} 
				else {
					return -1;
				}
//				for(int z : a) 
//					System.out.print(z + " ");
//				System.out.println(moves);
			}
		}
//		
//		for(int z : a) 
//			System.out.print(z + " ");
		
		return moves;
	}
}
