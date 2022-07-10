package problems_800;

import java.util.Scanner;

public class Problem_144A_Arrival_Of_The_General {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] heights = new int[n];

		for(int i = 0; i < n; i++)
			heights[i] = sc.nextInt();
		
		int maxHeight = 0;
		int indexOfMaxHeight = 0;
		for(int i = 0; i < n; i++) {
			maxHeight = Math.max(maxHeight, heights[i]);
		}
		for(int i = 0; i < n; i++) {
			if(heights[i] == maxHeight) {
				indexOfMaxHeight = i;
				break;
			}
		}
		
		int minHeight = 101;
		int indexOfMinHeight = 0;
		for(int i = 0; i < n; i++) {
			minHeight = Math.min(minHeight, heights[i]);
		}
		for(int i = n - 1; i >= 0; i--) {
			if(heights[i] == minHeight) {
				indexOfMinHeight = i;
				break;
			}
		}
		
		int noOfSwaps = 0;
		for(int i = indexOfMaxHeight; i > 0; i--) {
			if(heights[0] == maxHeight)
				break;
			if(heights[i] == maxHeight && heights[i - 1] != maxHeight) {
				int temp = heights[i];
				heights[i] = heights[i - 1];
				heights[i - 1] = temp;
				noOfSwaps++;
			}
		}
//		System.out.println(Arrays.toString(heights));
		
		for(int i = indexOfMinHeight; i < n - 1; i++) {
			if(heights[n - 1] == minHeight)
				break;
			if(heights[i] == minHeight && heights[i + 1] != minHeight) {
				int temp = heights[i];
				heights[i] = heights[i + 1];
				heights[i + 1] = temp;
				noOfSwaps++;
			}
		}
		
//		System.out.println(Arrays.toString(heights));
		
//		System.out.println(maxHeight + " " + minHeight + " " + noOfSwaps);
		
		System.out.println(noOfSwaps);
		
		sc.close();
	}

}
