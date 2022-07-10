package problems_800;

import java.util.Scanner;

public class Word_Capitalization_281A {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      String word = sc.nextLine();
      
      word = word.charAt(0) >= 97 ? ((char)(word.charAt(0) - 32) + word.substring(1, word.length())) : word;
 
      System.out.println(word);
      
      sc.close();
    }
}