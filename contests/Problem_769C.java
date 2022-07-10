package contests;

import java.util.Scanner;

public class Problem_769C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		 
        sc.nextLine();
 
        for (int i = 0; i < testCases; i++) {
        	solve(sc);
        }
        
        sc.close();
	}

	public static void solve(Scanner sc) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int operations = 0;
		while(true) {
			if(a == b) {
				break;
			}
			if((a | b) == b) {
				operations++;
				break;
			}
			if((a | b) < b) {
				a = (a | b);
				operations++;
			}
			else if((b - a) < ((a | b) - b)) {
				a++;
				operations++;
			}
			else if((b - a) > ((a | b) - b)){
				b++;
				operations++;
			}
		}
		
		System.out.println(operations);
		
	}
}
