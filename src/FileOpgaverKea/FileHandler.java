package FileOpgaverKea;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class FileHandler {

    public void filLæser(String filNavn, String data) throws FileNotFoundException {
        File file = new File(filNavn);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
    }

    public void filSkriver(String filNavn, String data) throws FileNotFoundException {
        File file = new File(filNavn);
            PrintStream ps = new PrintStream(new FileOutputStream(file, true));
            ps.println(data);
            ps.close();
    }

    public void deleteContents(String filNavn) throws FileNotFoundException{
        new PrintStream(filNavn).close();
    }
}