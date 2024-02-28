import java.util.Scanner;
public class Matmultiply   {   
   public static void main(String args[])   {   
      int i,j,k,rowsA,colsA,rowsB,colsB;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter rows for first matrix: ");
      rowsA = sc.nextInt();
      System.out.print("Enter columns for first matrix: ");
      colsA = sc.nextInt();
      System.out.print("Enter elements for first matrix: ");
      int matrixA[][] = new int[rowsA][colsA];
      for(i=0;i<rowsA;i++)   {
         for(j=0;j<colsA;j++)   {
            matrixA[i][j] = sc.nextInt();
         }
      }
      System.out.print("Elements of First matrix\n");
      for(i=0;i<rowsA;i++)   {
         for(j=0;j<colsA;j++)   {
            System.out.print(matrixA[i][j] +" ");
         }
         System.out.print("\n");
      }
      System.out.print("Enter rows for second matrix: ");
      rowsB = sc.nextInt();
      System.out.print("Enter columns for second matrix: ");
      colsB = sc.nextInt();
      System.out.print("Enter elements for second matrix: ");
      int matrixB[][] = new int[rowsB][colsB];
      for(i=0;i<rowsB;i++)   {
         for(j=0;j<colsB;j++)   {
            matrixB[i][j] = sc.nextInt();
         }
      }
      System.out.print("Elements of Second matrix\n");
      for(i=0;i<rowsB;i++)   {
         for(j=0;j<colsB;j++)   {
            System.out.print(matrixB[i][j] +" ");
         }
         System.out.print("\n");
      }
      int result[][] = new int[50][50];
      if(colsA != rowsB)   {
         System.out.print("Multiplication not possible!!");

      }
      else   {
         for(i=0;i<rowsA;i++)   {
            for(j=0;j<colsB;j++)   {
               for(k=0;k<rowsB;k++)   {
                  result[i][j]+=matrixA[i][k]*matrixB[k][j];
               }
            }
         }
      
      System.out.print("Resultant matrix: \n");
      for(i=0;i<rowsA;i++)   {
         for(j=0;j<colsB;j++)   {
            System.out.print(result[i][j] +" ");
         }
         System.out.print("\n");
      }
      }
   }
}
      
      
/*
 * Write a Java program that checks whether a given string is a palindrome or not. Ex: MALAYALAM is palindrome
 */
