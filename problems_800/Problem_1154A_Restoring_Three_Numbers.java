package problems_800;

import java.util.Scanner;

public class Problem_1154A_Restoring_Three_Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int q = sc.nextInt();
		int r = sc.nextInt();
		int s = sc.nextInt();
		sc.nextLine();
		int max = Math.max(Math.max(p, q), Math.max(r, s));
		
		if(max - p != 0)
			System.out.print(max - p + " ");
		if(max - q != 0)
			System.out.print(max - q + " ");
		if(max - r != 0)
			System.out.print(max - r + " ");
		if(max - s != 0)
			System.out.print(max - s);
		
		sc.close();
	}

}
