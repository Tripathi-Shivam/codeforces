package problems_800;

import java.util.Scanner;

public class Ultra_Fast_Mathematician_61A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pairOne = sc.nextLine();
		String pairTwo = sc.nextLine();
		
		int[] ans = xorOperation(pairOne, pairTwo);
		StringBuilder ansString = new StringBuilder();
		
		for(int i : ans)
			ansString.append(i);
		
		System.out.println(ansString);
		
		sc.close();
	}
	
	public static int[] xorOperation(String pairOne, String pairTwo) {
		int[] ans = new int[pairOne.length()];
		
		char[] pair1 = pairOne.toCharArray();
		char[] pair2 = pairTwo.toCharArray();
		
		for(int i = 0; i < ans.length; i++) {
			ans[i] = pair1[i] ^ pair2[i];
		}
		
		return ans;
	}

}
