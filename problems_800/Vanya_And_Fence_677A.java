package problems_800;

import java.util.Scanner;

public class Vanya_And_Fence_677A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h = sc.nextInt();
		int[] arr = new int[n];
		int width = 0;
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			if(arr[i] > h) 
				width += 2;
			else 
				width++;
		}
		
		System.out.println(width);
		
		sc.close();
	}

}
