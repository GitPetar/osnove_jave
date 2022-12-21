package p21_12_2022;
//Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i koji prikazuje element na poziciji K. K unosi korisnik i smatrajte da unosi u opsegu od 0 do 4.
//Primer:
//Unesite pozicjiu: 2
//Na pozicji 2 je vrednost 7.
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Integer> lista = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            lista.add(random.nextInt(100));

        }
        System.out.print("Unesite poziciju: ");
        int k = s.nextInt();
        System.out.println("Na poziciji "+k+" je vrednost "+lista.get(k));

    }
}
