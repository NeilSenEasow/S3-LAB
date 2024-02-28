public class ThreadSync   {
    public static void main(String[] args)   {
        Train t = new Train(1);
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);
        t1.setName("Neil");
        t2.setName("Rosh");
        t3.setName("Meenu");
        t1.start();
        t2.start();
        t3.start();
    }
}

class Train implements Runnable   {
    int avail = 1;
    int passengeer;
    Train(int passenger)   {
        this.passenger = passenger;
    }
    public synchronized void run()   {
        String name = Thread.currentThread().getName();
        if(avail >= passenger)   {
            System.out.println("For "+name+"Seat is Available");
            avail = avail - passenger;
        }
        else   {
            System.out.println("For "+name+"Seat is not Available");
        }
    }
}    


/*
 * Write a Java program that shows thread synchronization.
 */