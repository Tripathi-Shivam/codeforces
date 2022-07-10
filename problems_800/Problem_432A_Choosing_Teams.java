package problems_800;

import java.util.Scanner;

public class Problem_432A_Choosing_Teams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		int count = 0, noOfParticipants = 0;
		
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			if(5 - a[i] >= k)
				noOfParticipants++;
			if(noOfParticipants == 3) {
				count++;
				noOfParticipants = 0;
			}
		}
		
		System.out.println(count);
		
		sc.close();
	}

}
