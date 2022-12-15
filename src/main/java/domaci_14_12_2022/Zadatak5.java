package domaci_14_12_2022;

import java.util.Scanner;

// Napisati program koji u zavisnosti od operatora koji unosi korisnik sa tastature (operator je string i moze imati vrednosti +, - , *, /) racuna  i ispisuje na ekranu odgovarajuci zbir, razliku, proizvod ili kolicnik za dva broja a i b uneta sa tastature.
//         Primer 1:                                              Primer 2:
//         Unestite a: 6                                        Unestite a: 6
//         Unesite b: 3                                         Unesite b: 3
//         Unesite operator: +                             Unesite operator: /
//         Rezultat: 9                                           Rezultat: 2
public class Zadatak5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int rezultat;

        System.out.println("Unesite a: ");
        int a = s.nextInt();
        System.out.println("Unesite b: ");
        int b = s.nextInt();
        System.out.println("Unesite operator");
        String operator = s.next();

        if (operator.equals("+")) {
            rezultat = a + b;
            System.out.println("Rezultat: " + rezultat);
        } else if (operator.equals("-")) {
            rezultat = a - b;
            System.out.println("Rezultat: " + rezultat);
        } else if (operator.equals("/")) {
            rezultat = a / b;
            System.out.println("Rezultat: " + rezultat);
        } else if (operator.equals("*")) {
            rezultat = a * b;
            System.out.println("Rezultat: " + rezultat);
        }

    }
}
