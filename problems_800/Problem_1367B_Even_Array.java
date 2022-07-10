package problems_800;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem_1367B_Even_Array {

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
		ArrayList<Integer> odd = new ArrayList<>();
		ArrayList<Integer> even = new ArrayList<>();
		
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		
		if(n == 1) {
			return ((a[0] & 1) == 0) ? 0 : -1;
		}
		
		for(int i = 0; i < n; i++) {
			if((i & 1) == 0 && (a[i] & 1) == 1) {
				odd.add(a[i]);
			}
			else if((i & 1) == 1 && (a[i] & 1) == 0) {
				even.add(a[i]);
			}
		}
		
//		System.out.println(odd.size() + " " + even.size());
		
		return (odd.size() != even.size()) ? -1 : (odd.size()) ;
	}
}
