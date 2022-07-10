package contests;

import java.util.Arrays;
import java.util.Scanner;

public class Problem_Global_Round_19_A {

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
		int[] a = new int[n];
		int[] b = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = a[i];
		}
		
		Arrays.sort(b);
		
		int len = 1;
		
		for(int i = 0; i < n; i++) {
			int[] temp1 = new int[len];
			int[] temp2 = new int[n - len];
			for(int j = 0; j < len; j++) 
				temp1[j] = a[j];
			
			for(int j = len + 1; j < n - len; j++) 
				temp2[j] = a[j];
			
			Arrays.sort(temp1);
			Arrays.sort(temp2);
			
			for(int j = 0; j < len; j++) {
				if(temp1[j] != b[j]) {
					return "YES";
				}
			}
			
			for(int j = len + 1; j < n - len; j++) {
				if(temp2[j] != b[j]) {
					return "YES";
				}
			}
			
			len++;
		}
		
		return "NO";
	}
}
