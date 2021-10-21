package fileOpgaver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class FileReader {

    public static void main(String[] args) {

        File file = new File("data/demo.txt");
        String linje = "";
        try {
            Scanner scanner = new Scanner(file);
            linje = scanner.nextLine();
            System.out.println(linje);
            linje = scanner.nextLine();
            System.out.println(linje);
        } catch (FileNotFoundException e) {
            System.out.println("Pause" + e.getMessage());
        }
          /*Lommeregner lr = new Lommeregner();
        try {
            lr.add(2,4);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }*/
    }
}
