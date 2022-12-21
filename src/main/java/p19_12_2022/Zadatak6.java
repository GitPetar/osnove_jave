package p19_12_2022;

import java.util.Scanner;

//Napisati program koji od korisnika ucitava N jednocifrenih brojeva i od njih formira rezultujuci broj kao na primeru
//Unesite N: 5
//Unesite broj: 1
//Unesite broj: 2
//Unesite broj: 0
//Unesite broj: 4
//Unesite broj: 1
//Rezultujuci broj je 12041
public class Zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N: ");
        int n = s.nextInt();
        int modifier = 1;
        for (int i = 1; i < n; i++) {
            modifier *= 10;

        }
        int rezultat = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Unesite broj: " + i);
            rezultat = (s.nextInt() * modifier) + rezultat;
            modifier = modifier / 10;
        }
        System.out.println("Rezultirajuci broj je: " + rezultat);
    }
}
