package problems_800;

import java.util.Scanner;

public class Petya_And_Strings_112A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String stringOne = sc.nextLine().toLowerCase();
		String stringTwo = sc.nextLine().toLowerCase();
		
		System.out.println(compareLexicographically(stringOne, stringTwo));
		
		sc.close();
	}
	
	public static int compareLexicographically(String stringOne, String stringTwo) {
		int count = 0;
		for(int i = 0; i < stringOne.length(); i++) {
			if(stringOne.charAt(i) > stringTwo.charAt(i)) {
				return 1;
			}
			else if(stringOne.charAt(i) < stringTwo.charAt(i)) {
				return -1;
			}
			else {
				count++;
			}
		}
		return (count == stringOne.length() ? 0 : -1);
	}

}
