# Exception Handling Program

This Java program demonstrates the usage of `try`, `catch`, `throws`, and `finally` for handling exceptions.

## How it Works

1. The program defines a class `Try` containing two methods `fun1()` and `fun2()`, each throwing a different type of exception.
2. The `fun1()` method attempts to perform a division by zero operation, which throws an `ArithmeticException`. It catches this exception and prints a message accordingly. The `finally` block ensures that certain code is executed regardless of whether an exception occurs or not.
3. The `fun2()` method attempts to access an element of an array at an invalid index, resulting in an `ArrayIndexOutOfBoundsException`. It catches this exception and prints a message. Again, the `finally` block ensures that certain code is executed regardless of whether an exception occurs or not.
4. In the `main` method of the `ExceptionHandling` class, instances of the `Try` class are created, and both `fun1()` and `fun2()` methods are called to demonstrate exception handling.

## Usage

1. Compile the Java program using a Java compiler:

    ```shell
    javac ExceptionHandling.java
    ```

2. Run the compiled program:

    ```shell
    java ExceptionHandling
    ```

