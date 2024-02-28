# File Handling Program with Reader/Writer

This Java program demonstrates file handling using reader and writer classes (`FileReader` and `FileWriter`). It reads the content of a file named `Sample.txt` and writes it to a new file named `new.txt`.

## How it Works

1. The program reads from the file `Sample.txt` using a `FileReader`.
2. It writes the content read from `Sample.txt` to a new file named `new.txt` using a `FileWriter`.
3. After the operation is completed, it closes both the reader and writer.

## Usage

1. Compile the Java program using a Java compiler:

    ```shell
    javac File.java
    ```

2. Run the compiled program:

    ```shell
    java File
    ```

3. Ensure that `Sample.txt` exists in the same directory as the program.


# File Merge Program

This Java program merges the contents of two files named `sample1.txt` and `sample2.txt` into a single file named `merge.txt`.

## How it Works

1. The program reads the contents of `sample1.txt` and `sample2.txt` using two separate `FileReader` instances.
2. It writes the contents read from both files into a new file named `merge.txt` using a single `FileWriter`.
3. After the operation is completed, it closes all file readers and writers.

## Usage

1. Compile the Java program using a Java compiler:

    ```shell
    javac File2.java
    ```

2. Run the compiled program:

    ```shell
    java File2
    ```

3. Ensure that `sample1.txt` and `sample2.txt` exist in the same directory as the program.

## License

This program is released under the [insert license here]. See the LICENSE file for more details.


