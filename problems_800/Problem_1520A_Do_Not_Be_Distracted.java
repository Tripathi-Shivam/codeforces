package problems_800;

import java.util.HashSet;
import java.util.Scanner;

public class Problem_1520A_Do_Not_Be_Distracted {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		
		sc.nextLine();
		
		for(int i = 0; i < testCases; i++) {
			System.out.println(solve(sc));
		}
			
		sc.close();
	}
	
	public static String solve(Scanner sc) {
		int n = sc.nextInt();
		sc.nextLine();
		char[] tasks = sc.nextLine().toCharArray();
		HashSet<Character> set = new HashSet<>();
		int i = 0;
		while(i < n) {
			char c = tasks[i];
			set.add(c);
			while(i < n && tasks[i] == c)
				i++;
			
			if(i < n && set.contains(tasks[i])) {
				return "NO";
			}
		}
		return "YES";
	}
}
