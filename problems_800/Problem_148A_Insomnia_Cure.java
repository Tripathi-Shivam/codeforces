package problems_800;

import java.util.Scanner;

public class Problem_148A_Insomnia_Cure {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int l = sc.nextInt();
		int m = sc.nextInt();
		int n = sc.nextInt();
		int d = sc.nextInt();
		int[] dragons = new int[d + 1];
		
		int multiple = k;
		while(multiple <= d) {
			dragons[multiple]++;
			multiple += k;
		}
//		System.out.println(Arrays.toString(dragons));
		
		multiple = l;
		while(multiple <= d) {
			dragons[multiple]++;
			multiple += l;
		}
//		System.out.println(Arrays.toString(dragons));

		multiple = m;
		while(multiple <= d) {
			dragons[multiple]++;
			multiple += m;
		}
//		System.out.println(Arrays.toString(dragons));
		
		multiple = n;
		while(multiple <= d) {
			dragons[multiple]++;
			multiple += n;
		}
//		System.out.println(Arrays.toString(dragons));
		
		int count = 0;
		for(int i = 1; i <= d; i++) {
			if(dragons[i] > 0)
				count++;
		}
		
		System.out.println(count);
		
		sc.close();
	}

}
