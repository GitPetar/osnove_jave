package p19_12_2022;

import java.util.Scanner;

//Napisati program koji pronalazi K-ti stepen broja N. Koristeci FOR petlju
//K i N unosi korisnik.
//Primer izvrsenja:
//Unesite K: 7
//Unesite N: 2
//Rezultat 128
public class Zadatak4 {
    public static void main(String[] args) {
        int k;
        int n;
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite K: ");
        k = s.nextInt();
        System.out.println("Unesite N: ");
        n = s.nextInt();

        for (int i = 2; i <=k ; i++) {
            n = n*n;

        }
        System.out.println("Rezultat "+n);
    }
}
