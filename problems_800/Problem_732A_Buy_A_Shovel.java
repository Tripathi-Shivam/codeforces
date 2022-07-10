package problems_800;

import java.util.Scanner;

public class Problem_732A_Buy_A_Shovel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int r = sc.nextInt();
		int i = k, count = 1;
		while(i % 10 != 0) {
			if((i - r) % 10 == 0) {
				break;
			}
			count++;
//			System.out.print(count + " ");
			i = k * count;
//			System.out.print(i + " ");
		}
		System.out.println(count);
		
		sc.close();
	}

}
