package p21_12_2022;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//(Za vezbanje) Napisati program koji vrsi mesanje niza. Niz je duzine 10, proizvoljnih brojeva.
//Mesanje niza se vrsi tako sto se 8 puta vrsi zamena dva random elementa iz niza.
//primer jedne zamene:
//Ako je niz
//1,2,3,4,5,6,7,8,9,10
//i prvi random indeks je 4 a drugi random indeks je 6
//1,2,3,4,7,6,5,8,9,10
public class Zadatak7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Integer> lista = new ArrayList<Integer>();
        int placeholder;
        int placeholderIndex1;
        int placeholderIndex2;
        for (int i = 0; i < 10; i++) {
            lista.add(i+1);
            System.out.print(lista.get(i) + ", ");
        }
        System.out.println();
        for (int i = 0; i < 8; i++) {
            placeholderIndex1 = random.nextInt(10);
            placeholderIndex2 = random.nextInt(10);
            placeholder = lista.get(placeholderIndex1);
            lista.set(placeholderIndex1, lista.get(placeholderIndex2));
            lista.set(placeholderIndex2, placeholder);

        }
        for (int i = 0; i < 10; i++) {
            System.out.print(lista.get(i) + ", ");


        }
    }
}
