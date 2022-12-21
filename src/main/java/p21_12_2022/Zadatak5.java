package p21_12_2022;
//5.Zadatak
//Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i racuna i stampa sumu svih brojeva niza.
//Primer: Ako je niz 1,2,4,5,7
//Stampa se, suma = 19

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Integer> lista = new ArrayList<Integer>();
        int suma = 0;
        for (int i = 0; i < 5; i++) {
            lista.add(random.nextInt(100));
            suma += lista.get(i);

        }
        System.out.println("suma je: "+suma);

    }
}
