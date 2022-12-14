package p14_12_2022;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String ime;
        String prezime;
        String broj;
        String email;
        String jmbg;

        System.out.println("Unesite ime: ");
        ime = s.next();
        System.out.println("Unesite prezime: ");
        prezime = s.next();
        System.out.println("Unesite broj: ");
        broj = s.next();
        System.out.println("Unesite email: ");
        email = s.next();
        System.out.println("Unesite jmbg: ");
        jmbg = s.next();

        System.out.println(ime + " " + prezime + " " + jmbg);
        System.out.println("Broj tel: " + broj);
        System.out.println("Email: " + email);
    }
}
