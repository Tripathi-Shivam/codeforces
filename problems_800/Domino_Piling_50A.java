package problems_800;

import java.util.Scanner;

public class Domino_Piling_50A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		System.out.println(maximumDomino(m, n));
		
		sc.close();
	}
	
	public static int maximumDomino(int m, int n) {
		int count = 0;
		int[][] arr = new int[m][n];
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n - 1; j++) {
				if(arr[i][j] == 0 && arr[i][j + 1] == 0) {
					arr[i][j] = 1;
					arr[i][j + 1] = 1;
					j++;
					count++;
				}
			}
		}
		
//		for(int i = 0; i < m; i++) {
//			for(int j = 0; j < n; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m - 1; j++) {
				if(arr[j][i] == 0 && arr[j + 1][i] == 0) {
					arr[j][i] = 1;
					arr[j + 1][i] = 1;
					j++;
					count++;
				}
			}
		}
		
//		for(int i = 0; i < m; i++) {
//			for(int j = 0; j < n; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		return count;
	}

}
