package FileOpgaverKea;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class læsFraFile {
    public static void main(String[] args) {
        File file = new File("opgaver/læsFra.txt");
        String linje = "";
        try {
            Scanner scanner = new Scanner(file);
            linje = scanner.nextLine();
            String[] ordListe = linje.split(" ");
            ordListe[1].toUpperCase();
            System.out.println(linje);
            linje = scanner.nextLine();
            System.out.println(linje);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
