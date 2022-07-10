package problems_800;

import java.util.Scanner;

public class Tram_116A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] exits = new int[n];
		int[] entries = new int[n];
		
		
		for(int i = 0; i < n; i++) {
			exits[i] = sc.nextInt();
			entries[i] = sc.nextInt();
		}
		
		int capacity = entries[0];
		int currentCapacity = entries[0];
		for(int i = 1; i < n; i++) {
			currentCapacity = currentCapacity - exits[i] + entries[i];
			capacity = Math.max(currentCapacity, capacity);
		}
		
		System.out.println(capacity);
		
		sc.close();
	}

}
