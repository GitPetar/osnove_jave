package domaci16_12_2022;

import java.util.Scanner;

//Napisati program koji simulira paginaciju tabele. Korisnik sa tastature unosi:
//        ukupan broj rezultata
//        broj rezultata po strani
//        stranu
//        Program ispisuje poruku koji rezultati ce biti prikazani.
public class ZaVezbanje2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite ukupan broj rezultata: ");
        int ukupanBrojRezultata = s.nextInt();
        System.out.println("Unesite broj rezultata po strani: ");
        int brojRezultataPoStrani = s.nextInt();
        System.out.println("Unesite stranu: ");
        int strana = s.nextInt();
        //daje se zadnja strana ako je unet preveliki broj
        while ((strana - 1) * brojRezultataPoStrani > ukupanBrojRezultata) {
            strana = strana - 1;
        }

        System.out.println("Showing " + (((strana - 1) * brojRezultataPoStrani) + 1) + " to " + Math.min((brojRezultataPoStrani * strana), ukupanBrojRezultata) + " of " + ukupanBrojRezultata + " entries");
    }

}
