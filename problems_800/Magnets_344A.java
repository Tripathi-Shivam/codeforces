package problems_800;

import java.util.Scanner;

public class Magnets_344A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int count = 1;
		
		for(int i = 0; i < n; i++) 
			arr[i] = sc.nextInt();
		
		for(int i = 0; i < n - 1; i++) {
			if(arr[i] != arr[i + 1])
				count++;
		}
		
		System.out.println(count);
		
		sc.close();
	}

}
