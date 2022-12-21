package p20_12_2022;

import java.util.Scanner;

//Napisati program koji sabira brojeve koje korisnik unosi, pritom da suma ne predje 100.Na kraju programa ispisati sracunatu sumu.
//Unesite vrednost: 20
//Unesite vrednost: 50
//Unesite vrednost: 50
//Prekoracenje! Kraj programa. Sracunata suma je 70.
public class Zadatak7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int suma = 0;
        int broj;
        boolean prekoracenje = false;
        while (!prekoracenje) {
            System.out.print("Unesite vrednost: ");
            broj = s.nextInt();
            if (broj + suma > 100) {
                prekoracenje = true;
            } else {
                suma = broj + suma;
            }

        }
        System.out.println("Prekoracenje! Kraj programa. Sracunata suma je " + suma);
    }
}
