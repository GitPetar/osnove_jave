package p19_1_2022;

import java.util.Scanner;

//Napisati program koji iscrtava coveculjka C na tabli dimenzija 5x5. Korisnik unosi poziciju coveculjka. Pozicije u tabeli su kao sa slike.
//Primer izvrsenja:
//Unesite poziciju coveculjka: 17
public class Dodatno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite poziciju coveculjka: ");
        int pozicija = scanner.nextInt();
        for (int i = 1; i <= 25; i++) {
            if (pozicija == i) {
                System.out.print("|C");
            } else {
                System.out.print("| ");
            }
            if (i % 5 == 0) {
                System.out.println();
            }

        }
    }
}
