# QuickSort Algorithm

This Java program implements the QuickSort algorithm to sort an array of strings in ascending order.

## How it Works

QuickSort is a divide-and-conquer algorithm. It picks an element as a pivot and partitions the array around the pivot, such that elements smaller than the pivot are placed before it, and elements greater than the pivot are placed after it. This process is recursively applied to the subarrays until the entire array is sorted.

## Implementation Details

- The `partition` method selects the last element of the array as the pivot and rearranges the elements in the array such that all elements smaller than the pivot are on its left, and all elements greater than the pivot are on its right.
- The `sort` method recursively calls the `partition` method to sort subarrays.
- The `print_array` method prints the sorted array.

## Usage

1. Compile the Java program using a Java compiler:

    ```shell
    javac QuickSort.java
    ```

2. Run the compiled program:

    ```shell
    java QuickSort
    ```


