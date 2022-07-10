package problems_800;

import java.util.Scanner;
import java.util.Stack;

public class Problem_490A_Team_Olympiad {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n+1];
		Stack<Integer> prgIndecis = new Stack<>();
		Stack<Integer> mathIndecis = new Stack<>();
		Stack<Integer> peIndecis = new Stack<>();
		
		for(int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
			
			if(a[i] == 1) {
				prgIndecis.push(i);
			}
			else if(a[i] == 2) {
				mathIndecis.push(i);
			}
			else {
				peIndecis.push(i);
			}
		}
		
		int noOfTeams = Math.min(prgIndecis.size(), Math.min(mathIndecis.size(), peIndecis.size()));
		System.out.println(noOfTeams);
		for(int i = 1; i <= noOfTeams; i++) {
			System.out.print(prgIndecis.pop() + " " + mathIndecis.pop() + " " + peIndecis.pop());
			System.out.println();
		}
		
		sc.close();
	}

}
