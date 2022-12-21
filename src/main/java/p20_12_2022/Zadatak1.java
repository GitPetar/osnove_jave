package p20_12_2022;

import java.util.Scanner;

//Zadatak
//Napisati program koji validira unos input polja za broj. Polje za unos prima samo brojeve u opsegu od 10 do 50.Korisnik unosi vrednosti dok ne unese validan  broj.
//Primer izvrsenja:
//Unesite broj: 5
//Greska: Broj nije u opsegu od 10 do 50.
//Unesite broj: -1
//Greska: Broj nije u opsegu od 10 do 50.
//Unesite broj: 51
//Greska: Broj nije u opsegu od 10 do 50.
//Unesite broj: 40
//Broj je validan, kraj programa.
public class Zadatak1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int broj = 0;
        while (10 > broj || broj > 50) {
            System.out.println("Unesite broj: ");
            broj = s.nextInt();
            if (10 > broj || broj > 50) {
                System.out.println("Greska: Broj nije u opsegu od 10 do 50.");
            }
        }
        System.out.println("Broj je validan, kraj programa.");
    }
}

