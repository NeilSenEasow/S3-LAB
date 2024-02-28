# Employee Management System

This Java program implements a simple Employee Management System using inheritance. It consists of three classes:

- **`Employee`**: This class represents the base class for all employees. It has members such as name, age, phone number, address, and salary. It also contains a method `printSalary()` to print the salary of the employee.

- **`Officer`**: This class extends `Employee` and adds a new data member `specialization`. It provides a method `Display()` to display the details of an officer.

- **`Manager`**: This class also extends `Employee` and adds a new data member `department`. It provides a method `Display()` to display the details of a manager.

## How it Works

1. The `Employee` class serves as the base class with common attributes and behavior.
2. The `Officer` and `Manager` classes inherit from the `Employee` class, extending it with additional attributes specific to officers and managers.
3. In the `main` method of the `Inheritance` class, the user is prompted to enter details for an officer and a manager.
4. Objects of the `Officer` and `Manager` classes are created with the provided details and their respective `Display()` methods are called to print the details.

## Usage

1. Compile the Java program using a Java compiler:

    ```shell
    javac Inheritance.java
    ```

2. Run the compiled program:

    ```shell
    java Inheritance
    ```


