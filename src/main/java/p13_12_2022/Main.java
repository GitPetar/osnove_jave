package p13_12_2022;

import java.util.Scanner;

public class Uvod {

    public static void main(String[] args) {

        String Ime = "Tester";
        String Prezime = "Testic";
        String Broj_Telefona = "666666";
        String Ulica_i_Broj = "Ulica QA Testera 1000";
        String Grad = "Testville";
        String Email = "test@testmail.test";
        int sifra = 1;
        String Naziv_Proizvoda = "Test";
        int cena = 100;
        int popust = 99;
        String Boja = "Plava";
        String Velicina = "XXL";

        System.out.println(Ime + " " + Prezime);
        System.out.println(Broj_Telefona + " " + Ulica_i_Broj + " " + Grad);
        System.out.println(Email);
        System.out.println("");
        System.out.println("Idemo dalje...");
        System.out.println("");

        System.out.println(sifra);
        System.out.println(Naziv_Proizvoda+" - $"+cena+" - Popust "+popust+"%");
        System.out.println(Boja+", "+Velicina);
        System.out.println(" ");

        System.out.println("Hangman");
        System.out.println("- - - -");
        System.out.println("|      |");
        System.out.println("|      O");
        System.out.println("|     /|\\ ");
        System.out.println("|      |");
        System.out.println("|");
        System.out.println("_ _ _ _ _   _ _ _ A _");
    }
}
