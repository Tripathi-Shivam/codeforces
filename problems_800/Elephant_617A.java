package problems_800;

import java.util.Scanner;

public class Elephant_617A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int steps = 0;
		while(x > 0) {
			if(x - 5 >= 0) 
				x -= 5;
			else if(x - 4 >= 0) 
				x -= 4;
			else if(x - 3 >= 0) 
				x -= 3;
			else if(x - 2 >= 0) 
				x -= 2;
			else 
				x--;
			steps++;			
		}
		
		System.out.println(steps);
		
		sc.close();
	}

}
