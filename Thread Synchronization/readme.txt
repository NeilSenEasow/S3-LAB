# Thread Synchronization Program

This Java program demonstrates thread synchronization by managing the availability of seats in a train for multiple passengers.

## How it Works

1. The program defines a `Train` class implementing the `Runnable` interface. Each train has a limited number of available seats (`avail`) and can accommodate a certain number of passengers (`passenger`).
2. The `run()` method of the `Train` class is synchronized to ensure that only one thread can access it at a time. This prevents multiple threads from accessing and modifying the available seats concurrently, which could lead to inconsistencies.
3. In the `main` method of the `ThreadSync` class, three threads (`t1`, `t2`, and `t3`) are created, all referring to the same instance of the `Train` class.
4. Each thread represents a passenger (`Neil`, `Rosh`, and `Meenu`) attempting to book a seat in the train. The `start()` method is called on each thread to begin their execution.
5. When a thread executes, it checks if there are enough available seats in the train. If yes, it books the seat and updates the available seats count. If not, it prints a message indicating that the seat is not available.

## Usage

1. Compile the Java program using a Java compiler:

    ```shell
    javac ThreadSync.java
    ```

2. Run the compiled program:

    ```shell
    java ThreadSync
    ```


