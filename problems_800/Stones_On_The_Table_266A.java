package problems_800;

import java.util.Scanner;

public class Stones_On_The_Table_266A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String colour = sc.nextLine();
        
        char[] colours = colour.toCharArray();
        
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(colours[i] == colours[i + 1])
                count++;
        }
        System.out.println(count);
        
        sc.close();
    }
}