package problems_800;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem_1399A_Remove_Smallest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		 
        sc.nextLine();
 
        for (int i = 0; i < testCases; i++) {
        	System.out.println(solve(sc));
        }
        
        sc.close();
	}
	
	public static String solve(Scanner sc) {
		int n = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}
		Collections.sort(a);
		boolean isPossible = true;
		for(int i = 1; i < n; i++) {
		if(Math.abs(a.get(i) - a.get(i - 1)) > 1) {
				isPossible = false;
				break;
			}
		}
		
		return (isPossible) ? "YES" : "NO";
	}

}
