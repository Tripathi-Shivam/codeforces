package problems_800;

import java.util.Scanner;

public class Problem_703A_Mishka_And_Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mishkaWinCount = 0, chrisWinCount = 0;
		
		for(int i = 0; i < n; i++) {
			int mishkaNum = sc.nextInt();
			int chrisNum = sc.nextInt();
			if(mishkaNum > chrisNum)
				mishkaWinCount++;
			else if(mishkaNum < chrisNum)
				chrisWinCount++;
		}
		
		System.out.println((mishkaWinCount == chrisWinCount) ? "Friendship is magic!^^" : (mishkaWinCount > chrisWinCount) ? "Mishka"
				: "Chris");
		sc.close();
	}

}
