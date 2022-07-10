package problems_800;

import java.util.Arrays;
import java.util.Scanner;

public class Helpful_Maths_339A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		//solve(s);
		optimized(s);
		
		sc.close();
	}
	
	// Brute Force Solution
	public static void solve(String s) {
		String[] arr = s.split("\\+");
		
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i < arr.length-1)
				System.out.print("+");
		}
	}
	
	public static void optimized(String s) {
		String[] arr = s.split("\\+");
		int countOne = 0, countTwo = 0, countThree = 0;
		String solution = "";
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals("1"))
				countOne++;
			else if(arr[i].equals("2"))
				countTwo++;
			else 
				countThree++;
		}
		
		for(int i = 0; i < countOne; i++) 
			solution += "1+";
			
		for(int i = 0; i < countTwo; i++) 
			solution += "2+";
		
		for(int i = 0; i < countThree; i++) 
			solution += "3+";
		System.out.println(solution.substring(0, solution.length() - 1));
	}
}
