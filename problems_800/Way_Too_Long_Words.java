package problems_800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Way_Too_Long_Words {
	
	public static String[] abbreviation (String[] arr, int n) {
		
		for(int i = 0; i < n; i++) {
			if(arr[i].length() > 10) {
				String word = arr[i];
				int addreviatedLength = word.length() - 2;
				String abbreviatedWord = word.charAt(0) + Integer.toString(addreviatedLength) + word.charAt(word.length() - 1); 
				arr[i] = abbreviatedWord;				
			}
		}
		
		return arr;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(read.readLine());
		String[] arr = new String[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = read.readLine();
		}
		
		abbreviation(arr, n);
		
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
