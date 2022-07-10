package problems_800;

import java.util.Scanner;

public class In_Search_Of_An_Easy_Problem_1030A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isHard = false;
		
		for(int i = 0; i < n; i++) {
			int response = sc.nextInt();
			if(response == 1)
				isHard = true;
		}
		
		System.out.println((isHard) ? "HARD" : "EASY");
		
		sc.close();
	}

}
