package FileOpgaverKea;

import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class skrivTilFile {
    public static void main(String[] args) throws FileNotFoundException {
        FileHandler fh = new FileHandler();
        Scanner input = new Scanner(System.in);

        System.out.println("Opgave 1!\n");
        System.out.println("Gæt på et tal mellem 1-5: ");

        Random ran = new Random();
        int max = 5;
        int min = 1;

        int tal = ran.nextInt((max - min) + 1) + min;

        fh.filSkriver("opgaver/skrivTil.txt", tal + " ");

        int inputUser = input.nextInt();
        while (true) {
            if (inputUser == tal) {
                System.out.println("Du ramte rigtigt");
                break;
            } else {
                System.out.println("Du ramte forkert");
                System.out.println("Tallet er: " + tal);
            }
        }

        System.out.println("Opgave 2!\n");

        System.out.println("Hvad skal filen hedde? \nHusk mappe navnet først, så / \n(mappeNavn/navnetDuVilAngive) ");
        String inputUser1 = input.nextLine();

        System.out.println("Hvad skal der stå i filen? ");
        String inputUser2 = input.nextLine();

        fh.filSkriver(inputUser1, inputUser2);
    }
}

