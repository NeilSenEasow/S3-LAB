import java.util.Scanner;
public class Frequency   {
   public static void main(String args[])   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String str = sc.nextLine();
      System.out.print("Enter a character: ");
      char c = sc.nextLine().charAt(0);
      int count = 0;
      int i;
      for(i=0;i<str.length();i++)   {
         if(c==str.charAt(i))   {
            count++;
         }
      }
      if(count==0)   {
      System.out.print("Not present");
      }
      else   {
      System.out.print("Frequency: "+count);
      }    
    }   
}


/*
 *  Write a Java Program to find the frequency of a given character in a string.
 */