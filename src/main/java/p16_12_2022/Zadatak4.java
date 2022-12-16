package p16_12_2022;

import java.util.Scanner;

//Napisati program koji od korisnika ucitava jacinu zvuka (od 0 do 10) i stampa slikicu za zvuk sa brojem crtica koje je korisnik uneo.
//        Primer izvrsenja;
//        Unesite jacinu zvuka: 8
//< | | | | | | | |
public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String zvuk = "<";

        System.out.println("Unesite jacinu zvuka: ");
        int jacina = s.nextInt();
        if (10 < jacina) {
            jacina = 10;
        }

        for (int i = 0; i < jacina; i++) {
            zvuk = zvuk + "|";
        }
        if (jacina <= 0) {
            System.out.println("</");
        } else {
            System.out.println(zvuk);
        }
    }
}
