package p20_1_2022;
//ZA VEZBANJE) Napisati program koji izvlaci cifre iz visecifrenog broja. Broj koji se unosi je proizvoljan. Napomena: Unosite vrednosti maksimalno do 10 cifara, zbog ogranicenja int tipa.
//Primer izvrsenja:
//Unesite broj: 2109349
//9, 4, 3, 0, 9, 1, 2

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite broj: ");
        int n = s.nextInt();
        while (1 <= n) {
            System.out.print(n % 10);
            n = n / 10;
            if (1 <=n){
                System.out.print(", ");
            }

        }


    }
}

