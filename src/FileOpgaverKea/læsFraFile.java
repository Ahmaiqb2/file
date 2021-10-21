package FileOpgaverKea;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class læsFraFile {
    public static void main(String[] args) throws FileNotFoundException {

        FileHandler fh = new FileHandler();

        System.out.println("""
        Opgave 1!
        """);
        try {
            fh.filLæser("opgaver/læsFra.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Der er en fejl");
            e.printStackTrace();
        }

        System.out.println("\n------------------------------\n");

        System.out.println("""
        Opgave 2!
        """);
        try {
            fh.filLæser2("opgaver/DMI");
        } catch (FileNotFoundException e) {
            System.out.println("Der er en fejl");
            e.printStackTrace();
        }
    }
}