
import java.util.*;

class Thread_Even implements Runnable   {
	Thread t;
	int n;
	Thread_Even(int n)   {
		this.n=n;
		t = new Thread(this,"Thread1");
		System.out.println("Child Thread: "+t); //\n
		t.start();
	}
	public void run()   {
		int square = n * n;
		System.out.println("The number is even\nSquare of the number"+square);
	}
}

class Thread_Odd implements Runnable   {
	Thread th;
	int n;
	Thread_Odd(int n)   {
		this.n=n;
		th = new Thread(this,"Thread2");
		System.out.println("Child Thread: "+th);  //\n
		th.start();
	}
	public void run()   {
		int cube = n * n * n;
		System.out.println("The number is odd\nCube of the number is"+cube);
	}
}

public class MultiThread   {

	public static void main(String[] args)   {
		Scanner sc = new Scanner(System.in);
		int i;
		Random r = new Random();
		System.out.println("Enter random numbers count");
		int count = sc.nextInt();
		for( i = 0 ; i < count ; i++)   {
			int n = r.nextInt(20);
			System.out.println("The number is "+n);
			if( n % 2 == 0)   {
				Thread_Even ob1 = new Thread_Even(n);
			}
			else   {
				Thread_Odd ob2 = new Thread_Odd(n);
			}
		}
	}
}

/*
 * Write a Java program that implements a multi-threaded program which has three threads. First thread generates a random integer every 1 second. If the value is even, second thread computes the square of the number and prints. If the value is odd the third thread will print the value of cube of the number.
 */