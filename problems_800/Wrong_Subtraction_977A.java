package problems_800;

import java.util.Scanner;

public class Wrong_Subtraction_977A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		System.out.println(tanyasSubtraction(n, k));

		sc.close();
	}
	
	public static int tanyasSubtraction(int n, int k) {
		while(k-- > 0) {
			if(n % 10 == 0)
				n /= 10;
			else 
				n--;
		}
		return n;
	}

}
