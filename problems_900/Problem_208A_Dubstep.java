package problems_900;

import java.util.Scanner;

public class Problem_208A_Dubstep {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.println(solve(sc.nextLine()));
		System.out.println(otherWay(sc.nextLine()));
		
		sc.close();
	}

	public static String solve(String s) {
		s = s.replaceAll("WUB", " ");
		s = s.trim();
		s = s.replaceAll("  ", " ");
		return s;
	}
	
	public static String otherWay(String s) {
		String[] a = s.split("WUB");
		StringBuilder ans = new StringBuilder();
		
		for(String i : a) {
			if(!i.equals(""))
				ans.append(i + " ");
		}
		
		return ans.toString();
	}
}
