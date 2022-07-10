package contests;

import java.util.Scanner;

public class Problem_Edu_122_C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		 
        sc.nextLine();
 
        for (int i = 0; i < testCases; i++) {
        	System.out.println(solve(sc));;
        }
        
        sc.close();
	}
	
	public static int solve(Scanner sc) {
		char[] s = sc.next().toCharArray();
		int countZero = 0, countOne = 0;
		for(char i : s) {
			if(i == '0')
				countZero++;
			else 
				countOne++;
		}
		
		if(countZero > countOne)
			return countOne;
		else if(countZero < countOne)
			return countZero;
		else 
			return 0;
	}

}
