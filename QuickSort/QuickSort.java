import java.util.*;
public class   {
   Scanner sc=new Scanner(System.in);
   public int partition(String arr[],int low,int high)   {
   String pivot=arr[high];
   int i=low-1;
   for(int j=low;j<high;j++)   {
       if(arr[j].compareTo(pivot)<0)   {
           i++;
           String temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
       }
   }
   String temp=arr[i+1];
   arr[i+1]=arr[high];
   arr[high]=temp;
   return i+1;
   } 
   public void sort(String arr[],int low,int high)   {
       if(low<high)   {
           int pi=partition(arr,low,high);
           sort(arr,low,pi-1);
           sort(arr,pi+1,high);
       }
   }
   public void print_array(String arr[])   {
       int n=arr.length;
       for(int i=0;i<n;i++)   {
           System.out.println(arr[i]+"");
       }
       System.out.println("");
   }
   public static void main(String args[])   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the limits");
       int n=sc.nextInt();
       String a[]=new String[n];
       System.out.println("enter the numbers");
       for(int i=0;i<n;i++)   {
           a[i]=sc.next();
       }
       Quic ob=new Quic();
       ob.sort(a,0,n-1);
       System.out.println("Sorted array");
       ob.print_array(a);
   }
}

