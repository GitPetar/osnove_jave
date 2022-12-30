package PrviJavaTest;

import java.util.Scanner;

//Napisati program koji pruza mogucnost postavljanja lozinke. Korisnik prvo unosi lozinku a zatim program od korisnika zahteva unos kojim potvrdjuje lozinku sve dok se ne poklopi sa lozinkom ili dok mu se ne blokira mogucnost postavljanja lozinke. Korisnik moze maksimalno 3 puta da pogresi potvrdu lozinke.
//Ukoliko se lozinke ne poklapaju ispisati gresku “Lozinke se ne poklapaju”
//Ukoliko korisnik unese pogresno potvrdu lozinke vise od 3 puta, ispisati poruku “Mogucnost postavljanja lozinke je blokirana”
//Ukoliko se lozinke poklapaju ispisati “Lozinka je uspesno postavljena”
//Primer izvrsenja 1:
//Unesite lozinku: sifra123
//Potvrdite lozinku: pogresna
//Lozinke se ne poklapaju
//Potvrdite lozinku: pogresna
//Lozinke se ne poklapaju
//Potvrdite lozinku: sifra123
//Lozinka je uspesno postavljena
//
//
//Primer izvrsenja 2:
//Unesite lozinku: sifra123
//Potvrdite lozinku: pogresna
//Lozinke se ne poklapaju
//Potvrdite lozinku: pogresna
//Lozinke se ne poklapaju
//Potvrdite lozinku: pogresna
//Lozinke se ne poklapaju
//Potvrdite lozinku: pogresna
//Mogucnost postavljanja lozinke je blokirana
public class Zadatak4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String lozinka;
        String potvrda = "";
        int greske = 0;

        System.out.print("Unesite lozinku: ");
        lozinka = scanner.next();

        while (!lozinka.equals(potvrda) && greske < 4) {
            System.out.print("Potvrdite lozinku: ");
            potvrda = scanner.next();
            if (!lozinka.equals(potvrda) && greske < 3) {
                System.out.println("Lozinke se ne poklapaju");

            }
            greske++;
        }
        if (lozinka.equals(potvrda)) {
            System.out.println("Lozinka je uspesno postavljena");
        } else {
            System.out.println("Mogucnost postavljanja lozinke je blokirana");
        }
    }
}
