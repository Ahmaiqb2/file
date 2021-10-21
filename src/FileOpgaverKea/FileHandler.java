package FileOpgaverKea;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class FileHandler {

    //Opgave 1, Uppercase på bogstaver over 5
    public void filLæser(String filNavn) throws FileNotFoundException {

        File file = new File(filNavn);
        Scanner scanner = new Scanner(file);

        int ordLength = 5;

        while (scanner.hasNext()){
            String data = scanner.nextLine();
            String[] ordliste = data.split(" ");
            String ordet = "";
            for (int i = 0; i < ordliste.length; i++){
                String ord = ordliste[i];
                if (ord.length() >= ordLength){
                    ord = ord.toUpperCase();
                }
                ordet += ord + " ";
            }
            System.out.println(ordet);
        }
    }

    //Opgave 2, finde gennemsnitstemperaturen af byerne.
    public void filLæser2(String filNavn) throws FileNotFoundException {
        File file = new File(filNavn);
        Scanner scanner = new Scanner(file);

        double sum = 0;
        double temp = 0;
        int count = 0;
        String by;

        System.out.println("Byerne har af temperatur: ");
        while (scanner.hasNext()) {
            by = scanner.next();

            if (scanner.hasNextInt()) {
                temp = scanner.nextInt();
                sum += temp;
            }
            count++;
            System.out.printf(" - %s: %.0f grader\n", by, temp);
        }
        double gnsTemp = sum / count;
        System.out.println("\nGennemsnitstemperaturen: " + Math.round(gnsTemp) + " grader");
    }

    public void filSkriver(String filNavn, String data) throws FileNotFoundException {
        File file = new File(filNavn);
            PrintStream ps = new PrintStream(new FileOutputStream(file, true));
            ps.println(data);
            ps.close();
    }
}