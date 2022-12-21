package p21_12_2022;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//Napisati progam koji stampa niz u obrnutom redosledu tj. od zadnjeg elementa do nultog.
//Ako je niz 1,2,4,5,7, stampa se 7,5,4,2,1
public class Zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Integer> lista = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            lista.add(random.nextInt(100));

        }
        System.out.println("Lista unapred");
        for (int i = 0; i < 5; i++) {
            System.out.print(lista.get(i) + ", ");
        }
        System.out.println("Lista unazad");
        for (int i = 0; i < 5; i++) {
            System.out.print(lista.get(4 - i) + ", ");
        }


    }

}
