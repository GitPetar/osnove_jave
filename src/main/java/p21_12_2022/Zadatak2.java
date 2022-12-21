package p21_12_2022;
//Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i menja vrednost elementa na poziciji 3 tako sto je povecava 10 puta.

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Integer> lista = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            lista.add(random.nextInt(100));

        }
        System.out.println(lista.get(3));
        lista.set(3, lista.get(3) * 10);
        System.out.println(lista.get(3));


    }
}
