package problems_800;

import java.util.Scanner;

public class Problem_705A_Hulk {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        
		System.out.println(feelings(n));
		
        sc.close();
	}
	
	public static String feelings(int n) {
		if(n == 1)
			return "I hate it";
		StringBuilder ans = new StringBuilder();
	
		for(int i = 1; i < n; i++) {
			if(i % 2 != 0)
				ans.append("I hate that ");
			else 
				ans.append("I love that ");
		}
		if(n % 2 == 0)
			ans.append("I love it");
		else 
			ans.append("I hate it");
		
		return ans.toString();
	}

}
