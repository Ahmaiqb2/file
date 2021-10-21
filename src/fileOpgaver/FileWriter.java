package fileOpgaver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class FileWriter {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data/output.txt");
        PrintStream ps = new PrintStream(new FileOutputStream(file,true));

        for (int i = 1; i <= 5; i++){
            ps.append(i+" ");
        }
        ps.close();
    }
}
