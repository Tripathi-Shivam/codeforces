package problems_800;

import java.util.Scanner;

public class Bit_282A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		sc.nextLine();
		
		int x = 0;
		for(int i = 0; i < n; i++) {
			String operation = sc.nextLine();
			if(operation.contains("+"))
				x++;
			else 
				x--;
		}
		System.out.println(x);
		
		sc.close();
	}

}
