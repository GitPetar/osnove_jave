package p21_12_2022;
//1.Zadatak
//Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i prikazuje sumu nultog i zadnjeg elementa tog niza.

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Integer> lista = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            lista.add(random.nextInt(100));

        }
        int suma = lista.get(0) + lista.lastIndexOf(lista);
        int a = lista.get(0);
        int b = lista.get(4);
        System.out.println(a + " + " + b + " = " + suma);


    }
}
