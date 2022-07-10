package problems_800;

import java.util.Scanner;

public class Problem_151A_Soft_Drinking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, k, l, c, d, p, nl, np;
		n = sc.nextInt();
		k = sc.nextInt();
		l = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		p = sc.nextInt();
		nl = sc.nextInt();
		np = sc.nextInt();
		
		int drinks = (k * l) / nl;
		int limes = c * d;
		int salt = p / np;
		
		System.out.println(Math.min(Math.min(drinks, limes), salt) / n);
		
		sc.close();
	}
}
