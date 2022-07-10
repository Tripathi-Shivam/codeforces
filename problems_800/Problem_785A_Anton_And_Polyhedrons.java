package problems_800;

import java.util.Scanner;

public class Problem_785A_Anton_And_Polyhedrons {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		int countFaces = 0;
		
		while(n-- > 0) {
			String polyhedron = sc.nextLine();
			if(polyhedron.equals("Tetrahedron"))
				countFaces += 4;
			else if(polyhedron.equals("Cube"))
				countFaces += 6;
			else if(polyhedron.equals("Octahedron"))
				countFaces += 8;
			else if(polyhedron.equals("Dodecahedron"))
				countFaces += 12;
			else
				countFaces += 20;
		}
		
		System.out.println(countFaces);
		
		sc.close();
	}

}
