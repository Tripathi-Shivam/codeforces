package problems_800;

import java.util.Scanner;

public class Queue_At_The_School_266B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		sc.nextLine();
		String arrangement = sc.nextLine();

		char[] queue = arrangement.toCharArray();
		
		while(t-- > 0) {
			for(int i = 0; i < n - 1; i++) {
				if(queue[i] == 'B' && queue[i+1] == 'G') {
					char temp = queue[i];
					queue[i] = queue[i+1];
					queue[i+1] = temp;
					i++;
				}
			}
		}
		
		StringBuilder output = new StringBuilder();
		for(char i : queue)
			output.append(i);
		
		System.out.println(output);
		
		sc.close();
	}

}
