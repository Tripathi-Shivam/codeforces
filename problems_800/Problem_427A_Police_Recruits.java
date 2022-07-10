package problems_800;

import java.util.Scanner;

public class Problem_427A_Police_Recruits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int policeOfficer = 0, crime = 0;
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if(x == -1 && policeOfficer > 0) {
				policeOfficer--;
			}
			else if(x >= 0) {
				policeOfficer += x;
			}
			else {
				crime++;
			}
		}
		
		System.out.println(crime);
		
		sc.close();
	}

}
