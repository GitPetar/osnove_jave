package domaci_21_12_2022;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//Napisati program koji u sebi ima definisan niz od 10 broja (brojevi su proizvoljni) i koji menja vrednost elementa na pozciji K. K i novu vrednost unosi korisnik.
//Primer:
//Unesite pozicjiu od 0 do 9: 3
//Unesite novu vrednost: 11
//Element na 3. poziciji treba na kraju da ima vrednost 11 u vasem programu.
public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>();
        int k;
        int vrednost;
        for (int i = 0; i < 10; i++) {
            lista.add(i + 1);
            System.out.print(lista.get(i) + ", ");
        }
        System.out.println();
        System.out.print("Unesite poziciju od 0 do 9: ");
        k = s.nextInt();
        System.out.println("Unesite novu vrednost: ");
        vrednost = s.nextInt();
        lista.set(k, vrednost);

        for (int i = 0; i < 10; i++) {
            System.out.print(lista.get(i) + ", ");


        }
    }
}
