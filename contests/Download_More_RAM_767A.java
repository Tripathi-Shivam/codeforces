package contests;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Download_More_RAM_767A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		
		while(testCases-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			
			for(int i = 0; i < n; i++) 
				a[i] = sc.nextInt();
			
			for(int i = 0; i < n; i++) 
				b[i] = sc.nextInt();
			
			Pair[] pairOfRams = new Pair[n];
			for(int i = 0; i < n; i++)
				pairOfRams[i] = new Pair(a[i], b[i]);
				
			Arrays.sort(pairOfRams, new Comparator<Pair>() {
	            @Override public int compare(Pair p1, Pair p2)
	            {
	                return p1.key - p2.key;
	            }
	        });
			
			for(int i = 0; i < n; i++) {
				if(pairOfRams[i].key <= k)
					k += pairOfRams[i].value;
				else 
					break;
			}
			System.out.println(k);
		}
		
		sc.close();
	}

}
class Pair {
	int key, value;
	Pair(int key, int value) {
		this.key = key;
		this.value = value;
	}
}
