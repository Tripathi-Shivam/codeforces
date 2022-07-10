package problems_800;

import java.util.Scanner;

public class Problem_155A_I_love_Username {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] scores = new int[n];
		
		for(int i = 0; i < n; i++) 
			scores[i] = sc.nextInt();

		int max = scores[0], min = scores[0], count = 0;
		
		for(int i = 1; i < n; i++) {
			if(scores[i] > max) {
				max = scores[i];
				count++;
			}
			if(scores[i] < min) {
				min = scores[i];
				count++;
			}
		}
		
		System.out.println(count);
		
		sc.close();
	}

}
