package problems_900;

import java.util.Arrays;
import java.util.Scanner;

public class Problem_160A_Twins {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(solve(sc));
		
		sc.close();
	}

	public static int solve(Scanner sc) {
		int n = sc.nextInt();
		int[] a = new int[n];
		int coins = 0, totalSum = 0, mySum = 0;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			totalSum += a[i];
		}
		
		Arrays.sort(a);
		for(int i = n-1; i >= 0; i--) {
			if(totalSum >= mySum) {
				mySum += a[i];
				totalSum -= a[i];
				coins++;
			}
			else {
				break;
			}
		}
		
		return coins;
	}
}
