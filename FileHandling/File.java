import java.io.*;

public class File {
    public static void main(String args[]) {
        try {
            FileReader fr = new FileReader("Sample.txt");//FileReader
            FileWriter fw = new FileWriter("new.txt");//FileWriter
            int i;
            while ((i = fr.read()) != -1) {
                //System.out.println((char) i);
                fw.write((char)i);
            }
            fr.close();
            fw.close();
            System.out.print("\n");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
        System.out.print("Contents were moved to new file successfully\n");
    }
}

/*
 * Write a file handling program in Java with reader/writer.
 */
