package p16_12_2022;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite Ime:");
        String ime = s.next();
        System.out.println("Unesite Prezime:");
        String prezime = s.next();
        System.out.println("Unesite jmbg:");
        String jmbg = s.next();
        System.out.println("Unesite broj primeraka za stampu:");
        int brojPrimeraka = s.nextInt();

        for (int i = 1; i <= brojPrimeraka; i++) {

            System.out.println("Primerak" + i);
            System.out.println("**********************************");
            System.out.println("Ime i prezime: " + ime + " " + prezime);
            System.out.println("JMBG: " + jmbg);
            System.out.println("**********************************");
            System.out.println("");


        }
    }
}
