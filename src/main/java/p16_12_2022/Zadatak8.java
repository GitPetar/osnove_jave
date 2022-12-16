package p16_12_2022;
//Napisati program koji stampa 20 pozicija.
//        Za aktivnu poziciju stampa *
//        Za neaktivnu pozciju stampa _
//        Korisnik unosi granice za negativni opseg, unoseci A i B.
//        Primer izvrsenja:
//        Unesite a: 5
//        Unesite b: 10
//        * * * * _ _ _ _ _ _ * * * * * * * * * *
//        Objasnjenje: stampamo _ od 5 do 10 u ostalim situacijama stampamo *

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Unesite a: ");
        a = s.nextInt();
        System.out.println("Unesite b: ");
        b = s.nextInt();
        for (int i = 1; i <= 20; i++) {
            if (a <= i && i <= b) {
                System.out.print("_ ");
            } else {
                System.out.print("* ");
            }

        }

    }
}
