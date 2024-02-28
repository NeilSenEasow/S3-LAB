# Multi-Threaded Number Processor

This Java program implements a multi-threaded application with three threads. 

## Objective

The program generates a specified number of random integers and processes them concurrently using multiple threads. If the generated integer is even, one thread calculates its square, and if it's odd, another thread calculates its cube.

## How it Works

1. The program defines two custom `Runnable` classes: `Thread_Even` and `Thread_Odd`, each representing a thread for processing even and odd numbers respectively.
2. Each thread is responsible for calculating the square or cube of a number based on its parity.
3. In the `main` method of the `MultiThread` class, the user is prompted to enter the count of random numbers to generate.
4. For each generated number, if it's even, an instance of the `Thread_Even` class is created and started. If it's odd, an instance of the `Thread_Odd` class is created and started.
5. Each thread prints the result of the calculation.

## Usage

1. Compile the Java program using a Java compiler:

    ```shell
    javac MultiThread.java
    ```

2. Run the compiled program:

    ```shell
    java MultiThread
    ```

