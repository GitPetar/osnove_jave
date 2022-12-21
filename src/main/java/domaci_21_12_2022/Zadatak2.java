package domaci_21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

//Napisati program koji ucitava N brojeva i smesta ih u niz. Zatim, iz niza, broji koliko je parnih brojeva uneto. brojeve unosi korisnik.
//Unesite N: 5
//Unesite broj: 1
//Unesite broj: 3
//Unesite broj: 4
//Unesite broj: 7
//Unesite broj: 8
//U nizu ima 2 parna broja.
public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>();
        int n;
        int broj;
        int brojac = 0;
        System.out.print("Unesite N: ");
        n = s.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj:");
            broj = s.nextInt();
            lista.add(broj);
        }
        for (int i = 0; i < n; i++) {
            if (lista.get(i) % 2 == 0) {
                brojac++;
            }
        }
        System.out.println("U nizu ima "+brojac+" parna broja");


    }
}

