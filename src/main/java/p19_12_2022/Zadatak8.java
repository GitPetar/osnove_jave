package p19_12_2022;

import java.util.Scanner;

//Napisati program koji od korisnika ucitava N brojeva i na kraju ispisuje srednju vrednost svih brojeva.
//Unesite N: 5
//Unesite broj: 1
//Unesite broj: 2
//Unesite broj: 9
//Unesite broj: 6
//Unesite broj: 8
//Srednja vrednost je 5.
//(Objasnjenj) 5 jer je celobrojno deljenje!
public class Zadatak8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N: ");
        int n = s.nextInt();
        int rezultat = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Unesite broj: " + i);
            rezultat = s.nextInt() + rezultat;
        }
        System.out.println("Srednja vrednost je: " + rezultat / n);
    }
}
