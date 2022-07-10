package problems_800;

import java.util.Scanner;

public class Problem_381A_Sereja_And_Dima {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
    	solve(sc);
        
    	sc.close();
	}
	
	public static void solve(Scanner sc) {
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		
		if(n == 1) {
			System.out.println(a[0] + " " + 0);
			return;
		}
		int i = 0, j = n-1;
		int serejaSum = 0, dimaSum = 0;
		boolean serejaTurn = true;
		while(i < j) {
			if(i+1 == j) {
				if(a[i] > a[j] && serejaTurn) {
					serejaSum += a[i];
					dimaSum += a[j];
					break;
				}
				else if(a[i] < a[j] && serejaTurn){
					serejaSum += a[j];
					dimaSum += a[i];
					break;
				}
				else if(a[i] > a[j] && !serejaTurn) {
					dimaSum += a[i];
					serejaSum += a[j];
					break;
				}
				else {
					dimaSum += a[j];
					serejaSum += a[i];
					break;
				}
			}
			
			if(a[i] > a[j] && serejaTurn) {
				serejaSum += a[i];
				i++;
				serejaTurn = false;
			}
			else if(a[i] < a[j] && serejaTurn){
				serejaSum += a[j];
				j--;
				serejaTurn = false;
			}
			else if(a[i] > a[j] && !serejaTurn) {
				dimaSum += a[i];
				i++;
				serejaTurn = true;
			}
			else {
				dimaSum += a[j];
				j--;
				serejaTurn = true;
			}
//			System.out.println(serejaSum + " " + dimaSum);
		}
		System.out.println(serejaSum + " " + dimaSum);
	}
}