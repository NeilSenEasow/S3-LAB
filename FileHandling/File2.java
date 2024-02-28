import java.io.*;

public class File2 {
    public static void main(String args[]) {
        try {
            FileReader fr1 = new FileReader("sample1.txt");
            FileReader fr2 = new FileReader("sample2.txt");
            FileWriter fw = new FileWriter("merge.txt");
            int i;
            while( (i=fr1.read()) != -1 ) {
                fw.write((char)i);
            }
            while( (i=fr2.read()) != -1 ) {
                fw.write((char)i);
            }
            fr1.close();
            fr2.close();
            fw.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
        System.out.print("Contents were moved to new file successfully\n");
    }
}


/*
 * Write a program to merge content of two files.
 */