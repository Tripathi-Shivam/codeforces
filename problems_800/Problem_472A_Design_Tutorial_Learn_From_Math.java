package problems_800;

import java.util.Scanner;

public class Problem_472A_Design_Tutorial_Learn_From_Math {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// Since n >= 12 
		if((n & 1) == 0)  
			System.out.println(8 + " " + (n - 8));
		else
			System.out.println(9 + " " + (n - 9));
		sc.close();
	}

}
