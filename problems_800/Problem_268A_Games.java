package problems_800;

import java.util.Scanner;

public class Problem_268A_Games {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] colors = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			colors[i][0] = sc.nextInt();
			colors[i][1] = sc.nextInt();
		}
		
		System.out.println(optimized(n, colors));
		//System.out.println(solve(n, colors));
		
		sc.close();
	}
	
	// Brute force approach
	public static int solve(int n, int[][] colors) {
		int count = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(colors[i][0] == colors[j][1])
					count++;
			}
		}
		return count;
	}
	
	// Optimized approach O(N + M) where M is length of colors range i.e. 100 in our case
	public static int optimized(int n, int[][] colors) {
		int[] colorsH = new int[101];
		int[] colorsA = new int[101];
		
		for(int i = 0; i < n; i++) {
			colorsH[colors[i][0]]++;
		}
		
		for(int i = 0; i < n; i++) {
			colorsA[colors[i][1]]++;
		}
		
		int sumOfProduct = 0;
		for(int i = 1; i <= 100; i++) {
			sumOfProduct += colorsH[i] * colorsA[i];
		}
		
		return sumOfProduct;
	}

}
