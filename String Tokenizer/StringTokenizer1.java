import java.util.*;
public class StringTokenizer1   {
     public static void main(String[] args)   {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the string: ");
         String str = sc.nextLine();
         //System.out.println("String: "+str);
         StringTokenizer sz = new StringTokenizer(str," ");
         int sum = 0;
         try   {
             while(sz.hasMoreTokens())   {
                 String x = sz.nextToken();
                 System.out.println(x);
                 sum = sum + Integer.parseInt(x);

             }
             System.out.print("Sum: "+sum);
         }
         catch(Exception e)   {
             System.out.print("Error");
         }
     }
}


/*
 * Write a Java program that reads a line of integers, and then displays each integer, and the sum of all the integers (Use String Tokenizer class of java.util).
 */