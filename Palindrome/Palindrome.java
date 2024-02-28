import java.util.Scanner;

public class Palindrome {
   public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int flag = 0;
        int i,j;
        int l = input.length();
        for(i=0;i<l/2;i++) {
           if(input.charAt(i)!=input.charAt(input.length()-i-1))  {
              flag = 1;
              break;
           }
        }
      if(flag == 0) {
         System.out.print("Palindrome!!!");
      }
      else {
         System.out.print("Not a Palindrome");
      }    
    }
}


/*
 * Write a Java program that checks whether a given string is a palindrome or not.
 */