package problems_800;

import java.util.Scanner;

public class Beautiful_Matrix_263A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] positionOfOne = new int[2];
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				int input = sc.nextInt();
				if(input == 1) {
					positionOfOne[0] = i;
					positionOfOne[1] = j;
				}
			}
		}
		
		System.out.println((Math.abs(3 - positionOfOne[0]) + Math.abs(3 - positionOfOne[1])));
		
		sc.close();
	}

}
