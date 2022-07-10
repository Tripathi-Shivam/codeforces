package problems_800;

import java.util.Scanner;

public class Problem_141A_Amusing_Joke {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String guest = sc.nextLine();
		String host = sc.nextLine();
		String pile = sc.nextLine();
		
		System.out.println(solve(guest, host, pile));
		
		sc.close();
	}
	
	public static String solve(String guest, String host, String pile) {
		int[] charCount = new int[26];
		
		for(int i = 0; i < guest.length(); i++) {
			charCount[guest.charAt(i) - 65]++;
		}
		for(int i = 0; i < host.length(); i++) {
			charCount[host.charAt(i) - 65]++;
		}
		for(int i = 0; i < pile.length(); i++) {
			charCount[pile.charAt(i) - 65]--;
		}
		
		boolean canPermute = true;
		for(int i = 0; i < 26; i++) {
			if(charCount[i] != 0) {
				canPermute = false;
				break;
			}
		}
		
		return (canPermute ? "YES" : "NO");
	}

}
