package problems_800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Team_231A {

	public static int noOfImplemention(HashMap<Integer, String[]> view, int n) {
		int count = 0;
		for(int i = 0; i < n; i++) {
			String[] solution = view.get(i);
			int temp = 0;
			for(int j = 0 ; j < 3; j++) {
				if(Integer.parseInt(solution[j]) == 1)
					temp++;
			}
			if(temp >= 2)
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Integer, String[]> sol = new HashMap<>();
		
		int n = Integer.parseInt(read.readLine());
		
		for(int i = 0; i < n; i++) {
			String viewOnSol = read.readLine();
			String[] viewOnSolution = viewOnSol.split(" ");
			sol.put(i, viewOnSolution);
		}
		
		System.out.println(noOfImplemention(sol, n));
		/*
		for(int i = 0; i < n; i++) {
			String[] temp = sol.get(i);
			for(int j = 0; j < 3; j++) {
				//System.out.println(arr[i][j]);
				System.out.println(temp[j]);
			}
			System.out.println(temp.length);
		}
		*/
	}
}
	
