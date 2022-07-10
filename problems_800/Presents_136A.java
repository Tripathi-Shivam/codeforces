package problems_800;

import java.util.Scanner;

public class Presents_136A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n + 1];
		int[] output = new int[n + 1];
		
		for(int i = 1; i <= n; i++) 
			arr[i] = sc.nextInt();
		
		for(int i = 1; i <= n; i++) { 
			int p = arr[i];
			output[p] = i;
		}
		
		for(int i = 1; i <= n; i++)
			System.out.print(output[i] + " ");
		
		sc.close();
	}

}
