package domaci_19_12_2022;

import java.util.Scanner;

//Napisati program koji od korisnika ucitava N brojeva i sabira samo parne brojeve. Na kraju programa prikazati sumu.
//Primer izvrsenja:
//Unesite N: 5
//Unesite broj: 1
//Unesite broj: 2
//Unesite broj: 9
//Unesite broj: 6
//Unesite broj: 8
//Suma parnih brojeva je 16
//Objasnjenje: 2 + 6 + 8 = 16
public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N: ");
        int n = s.nextInt();
        int suma = 0;
        int placeholder;
        for (int i = 1; i <= n; i++) {
            System.out.println("Unesite broj: " + i);
            placeholder = s.nextInt();
            if (placeholder % 2 == 0) {
                suma += placeholder;
            }
        }
        System.out.println("Suma parnih brojeva je: " + suma);
    }
}
