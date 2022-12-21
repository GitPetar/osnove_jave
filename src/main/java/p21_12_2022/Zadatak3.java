package p21_12_2022;
//Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i koji zamenjuje vrednosti prvog (na poziciji nula) i zadnjeg elemnta niza.

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Integer> lista = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            lista.add(random.nextInt(100));

        }
        System.out.println("index 0 " + lista.get(0));
        System.out.println("zadnji index " + lista.get(lista.size() - 1));

        int placeholder = lista.get(0);
        lista.set(0, lista.get(lista.size() - 1));
        lista.set((lista.size() - 1), placeholder);

        System.out.println("index 0 " + lista.get(0));
        System.out.println("zadnji index " + lista.get(lista.size() - 1));


    }
}
