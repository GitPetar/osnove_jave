package domaci_20_12_2022;

import java.util.Scanner;

//Napisati program koji ucitava RIMSKE brojeva od korisnika i na ekranu ispisuje arapsku vrednost sve dok korisnik ne unese KRAJ..
//
//Primer izvrsenja:
//Unesite rimski broj: X
//Arapski: 10
//Unesite rimski broj: C
//Arapski: 50
//Unesite rimski broj: D
//Arapski: 500
//Unesite rimski broj: M
//Arapski: 1000
//Unesite rimski broj: I
//Arapski: 1
//Unesite rimski broj: KRAJ
//Kraj programa.
public class Zadatak2_OVERKILL {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        boolean rip = true;
        String rimski;
        int broj = 0;

        while (rip) {
            broj = 0;
            System.out.print("Unesite rimski broj: ");
            rimski = s.next();
            if (rimski.contains("KRAJ")) {
                rip = false;
            } else {
                for (int i = 0; i < rimski.length(); i++) {
                    if (rimski.charAt(i) == 'I') {
                        broj++;
                    }
                }
                for (int i = 0; i < rimski.length(); i++) {
                    if (rimski.charAt(i) == 'V') {
                        broj += 5;
                    }
                }
                for (int i = 0; i < rimski.length(); i++) {
                    if (rimski.charAt(i) == 'X') {
                        broj += 10;
                    }
                }
                for (int i = 0; i < rimski.length(); i++) {
                    if (rimski.charAt(i) == 'L') {
                        broj += 50;
                    }
                }
                for (int i = 0; i < rimski.length(); i++) {
                    if (rimski.charAt(i) == 'C') {
                        broj += 100;
                    }
                }
                for (int i = 0; i < rimski.length(); i++) {
                    if (rimski.charAt(i) == 'D') {
                        broj += 500;
                    }
                }
                for (int i = 0; i < rimski.length(); i++) {
                    if (rimski.charAt(i) == 'M') {
                        broj += 1000;
                    }
                }
                System.out.println("Arapski: "+broj);
            }
        }
        System.out.println("Kraj programa.");
    }
}
// Da, znam da je ovo overkill, ali mi je bilo zabavno da napravim, hehe
