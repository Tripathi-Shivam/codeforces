package problems_800;

import java.util.Scanner;

public class Soldier_And_Bananas_546A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int w = sc.nextInt();
		int totalAmount = 0; 
		
		while(w > 0) {
			totalAmount += w * k;
			w--;
		}
		int amountToBorrow = totalAmount - n; 
		
		System.out.println((amountToBorrow <= 0) ? 0 : amountToBorrow);
		
		sc.close();
	}

}
