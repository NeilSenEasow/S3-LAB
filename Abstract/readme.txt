# Shape Abstract Class

This Java program demonstrates the concept of abstract classes and inheritance. It defines an abstract class `Shape` with an abstract method `numberOfSides()`. The program provides three concrete classes: `Rectangle`, `Triangle`, and `Hexagon`, each extending the `Shape` class and implementing the `numberOfSides()` method.

## How it Works

1. **`Shape` Abstract Class**: This class contains an abstract method `numberOfSides()`, which is intended to be implemented by its subclasses. It serves as the base class for shapes.

2. **Concrete Subclasses**:
   - **`Rectangle`**: Represents a rectangle shape. It overrides the `numberOfSides()` method to specify that a rectangle has 4 sides.
   - **`Triangle`**: Represents a triangle shape. It overrides the `numberOfSides()` method to specify that a triangle has 3 sides.
   - **`Hexagon`**: Represents a hexagon shape. It overrides the `numberOfSides()` method to specify that a hexagon has 6 sides.

3. **`Abstract` Main Class**: This class contains the `main` method where instances of `Rectangle`, `Triangle`, and `Hexagon` are created and their `numberOfSides()` methods are called.

## Usage

1. Compile the Java program using a Java compiler:

    ```shell
    javac Abstract.java
    ```

2. Run the compiled program:

    ```shell
    java Abstract
    ```


