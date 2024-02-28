# Traffic Light Simulator

This Java program simulates a traffic light using Swing components. The program allows the user to select one of three lights: red, yellow, or green. When a radio button is selected, the corresponding light is turned on, and only one light can be on at a time. No light is on when the program starts.

## How it Works

The program consists of two classes:

- **`light`**: This class extends `JPanel` and implements the `ActionListener` interface. It represents the panel containing the traffic lights. The class creates radio buttons for red, yellow, and green lights and handles their selection using the `actionPerformed` method. The `paintComponent` method is overridden to paint the traffic lights based on the selected radio button.

- **`Traffic`**: This class contains the `main` method and is responsible for creating the JFrame and adding the `light` panel to it.

## Usage

1. Compile the Java program using a Java compiler:

    ```shell
    javac Traffic.java
    ```

2. Run the compiled program:

    ```shell
    java Traffic
    ```

3. Select the radio button corresponding to the desired traffic light color.

