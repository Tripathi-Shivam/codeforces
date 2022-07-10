package problems_800;

import java.util.Scanner;

public class Drinks_200B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] volume = new int[n];
		for(int i = 0; i < n; i++) 
			volume[i] = sc.nextInt();
		
		System.out.println(volumeFraction(volume, n));
		
		sc.close();
	}
	
	public static double volumeFraction(int[] volume, int n) {
		double sum = 0D;
		for(int i : volume)
			sum += i;
		
		return sum/n;
	}

}
