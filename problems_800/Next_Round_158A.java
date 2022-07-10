package problems_800;

import java.util.Scanner;

public class Next_Round_158A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] scores = new int[n];
		
		for(int i = 0; i < n; i++) {
			scores[i] = sc.nextInt();
		}
		
		int minimumScore = scores[k - 1];
		int count = 0;
		for(int i = 0; i < n; i++) {
			if(scores[i] < 1)
				break;
			if(scores[i] >= minimumScore)
				count++;
			else 
				break;
		}
		
		System.out.println(count);
		sc.close();
	}

}
