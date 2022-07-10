package problems_800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Watermelon {
	
	public static void main(String[] args) throws IOException{
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int weight = Integer.parseInt(read.readLine());
		
		if(weight > 2 && weight %  2 == 0) 
			System.out.println("YES");
		else 
			System.out.println("NO");
	}
}
