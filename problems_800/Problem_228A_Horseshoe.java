package problems_800;

import java.util.HashSet;
import java.util.Scanner;

public class Problem_228A_Horseshoe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] colours = new int[4];
		for(int i = 0; i < 4; i++) 
			colours[i] = sc.nextInt();
        
		System.out.println(solve(colours));
		//System.out.println(minimumHorseshoes(colours));
		
        sc.close();

	}
	//optimization using set
	public static int solve(int[] colours) {
		HashSet<Integer> set = new HashSet<>();
		
		for(int i : colours)
			set.add(i);
		
		return 4 - set.size();
	}
	
	
	// brute force approach
	public static int minimumHorseshoes(int[] colours) {
		int ans = 0;
		
		for(int i = 0; i < 3; i++) {
			for(int j = i + 1; j < 4; j++) {
				if(colours[i] == colours[j]) {
					ans++;
					break;
				}
			}
		}
		
		return ans;
	}
}
