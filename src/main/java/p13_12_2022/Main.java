package p13_12_2022;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Podaci Test = new Podaci();
        Test.stampaj_podatke();
        Proizvod Nike = new Proizvod();
        Nike.stampaj_proizvod();

        String String_Placeholder;
        Scanner s = new Scanner(System.in);

        System.out.print("Oces da ti stampam podatke o osobi? YES/NO ");
        String_Placeholder = s.nextLine();
        if (String_Placeholder.equals("YES")) {

            System.out.println(Test.Ime + " " + Test.Prezime);
            System.out.println(Test.Broj_Telefona + " " + Test.Ulica_i_Broj + " " + Test.Grad);
            System.out.println(Test.Email);
            System.out.println("");
            System.out.println("Idemo dalje...");
            System.out.println("");
        }

        System.out.print("Oces da ti stampam podatke o proizvodu? YES/NO ");
        String_Placeholder = s.nextLine();
        if (String_Placeholder.equals("YES")) {
            System.out.println(Nike.sifra);
            System.out.println(Nike.Naziv_Proizvoda + " - $" + Nike.cena + " - Popust " + Nike.popust + "%");
            System.out.println(Nike.Boja + ", " + Nike.Velicina);
            System.out.println(" ");
        }
        System.out.print("A cica glisu? YES/NO ");
        String_Placeholder = s.nextLine();
        if (String_Placeholder.equals("YES")) {

            System.out.println("Hangman");
            System.out.println("- - - -");
            System.out.println("|      |");
            System.out.println("|      O");
            System.out.println("|     /|\\ ");
            System.out.println("|      |");
            System.out.println("|");
            System.out.println("_ _ _ _ _   _ _ _ A _");
        } else {
            System.out.println("EROR! EROR! EROR!");
            System.out.println("Cica Glisa je neophodan za rad programa!");
            System.out.println("Stampanje Cica Glise...100%");
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
}
