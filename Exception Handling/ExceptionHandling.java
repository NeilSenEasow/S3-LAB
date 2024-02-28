class Try   {
    public void fun1() throws ArithmeticException   {
        try   {
            int a = 10;
            int b = 0;
            int div = a / b;
            System.out.print("div :"+div);
        }
        catch(ArithmeticException e)   {
            System.out.println("Printed if div is not possible");
        }
        finally   {
            System.out.println("This line is executed either way!");
        }
    }
    public void fun2() throws ArrayIndexOutOfBoundsException   {
        try {
        int a[] = new int [2];
        System.out.print("Element: "+a[7]);
        throw new ArrayIndexOutOfBoundsException();
        }
        catch(ArrayIndexOutOfBoundsException e)   {
            System.out.println("This is an array exception!");
        }
        finally   {
            System.out.println("End of program");
        }
    }
}
public class ExceptionHandling   {
    public static void main(String[] args)   {
        Try obj = new Try();
        obj.fun1();
        obj.fun2();
    }
} 

/*
 * Write a Java program that shows the usage of try, catch, throws and finally.
 */