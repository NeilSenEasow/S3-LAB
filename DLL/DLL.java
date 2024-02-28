import java.util.*;

public class DLL   {
    public static void main(String[] args)   {
        int ch;
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> ll = new LinkedList<Integer>();
        System.out.println("<<Linked List Operations>>");
        System.out.println("1.Insertion\n2.Delete from Front\n3.Delete From End\n4.Delete From Any Position\n5.Display\n6.Exit");
        do   {
            System.out.print("Enter a choice: ");
            ch = sc.nextInt();
            switch(ch)   {
                case 1:
                    //Scanner sc = new Scanner(System.in);
                    System.out.print("Enter size of list: ");
                    int limit = sc.nextInt();
                    for( int i = 0 ; i < limit ; i++)   {
                        System.out.print("Enter number to be inserted in the index "+i+": ");
                        int x = sc.nextInt();
                        ll.add(x);
                    } 
                    break;
                case 2:
                    //Delete_Front();
                    try   {
                        int delFront = ll.removeFirst();
                        System.out.println("Deleted element is "+delFront);
                    }
                    catch(Exception e)   {
                        System.out.println("Error");
                    }
                    break;
                case 3:
                    //Delete_End();
                    try   {
                        int delEnd = ll.removeLast();
                        System.out.println("Deleted element is: "+delEnd);
                    }
                    catch(Exception e)
                    {
                        System.out.println("Error");
                    }
                    break;
                case 4:
                    //Delete_Position(); 
                    System.out.print("Enter position to be deleted: ");
                    int pos = sc.nextInt();
                    int del = ll.remove(pos);
                    System.out.println("Deleted element is: "+del);
                    break;
                case 5:
                    System.out.print("Array List\n");
                    System.out.println(ll);
                    /*System.out.print("Array elements\n");
                    for( int i : ll)
                       {
                           System.out.println(i);
                       }*/
                    break;
                default:
                    System.out.println("Exiting");
                    break;
            }
        }
        while( ch != 6);      
    }    
}
  

/*
 * Write a Java program for the following: ** 1) Create a doubly linked list of elements. 2) Delete a given element from the above list. 3) Display the contents of the list after deletion.
 */