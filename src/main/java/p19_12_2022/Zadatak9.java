package p19_12_2022;

import java.util.Scanner;

//Napisati program koji za sve petocifrene brojeve izvlaci sve cifre i stampa ih na ekranu.
//Primer izvrsenja:
//Unesite broj: 19452
//2, 5, 4, 9, 1
public class Zadatak9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite broj: ");
        int n = s.nextInt();
        for (int i = 0; i < 5; i++) {
            System.out.print(n % 10 + ", ");
            n = n / 10;

        }
    }
}

