package problems_800;

import java.util.Scanner;

public class Problem_469A_I_Wanna_Be_The_Guy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		int[] littleX = new int[p];
		
		for(int i = 0; i < p; i++) {
			littleX[i] = sc.nextInt();
		}
		
		int q = sc.nextInt();
		int[] littleY = new int[q];
		
		for(int i = 0; i < q; i++) {
			littleY[i] = sc.nextInt();
		}
		
		int[] levelsPassed = new int[n + 1];
		for(int i : littleX)
			levelsPassed[i]++;
		
		for(int i : littleY)
			levelsPassed[i]++;

		boolean allLevelsCleared = true;
		for(int i = 1; i <= n; i++) {
			if(levelsPassed[i] == 0) {
				allLevelsCleared = false;
				break;
			}	
		}
		
		System.out.println(allLevelsCleared ? "I become the guy." : "Oh, my keyboard!");
		
		sc.close();
	}

}
