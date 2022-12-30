package PrviJavaTest;

import java.util.ArrayList;
import java.util.Scanner;

//Napisati program koji cuva dva niza celih brojeva, jedan za parne brojeve a drugi za neparne brojeve. Program sa tastature ucitava N brojeva koje unosi korisnik i parne brojeve dodaje u niz parnih brojeva a neparne brojeve u niz neparnih. Na kraju programa odstampati brojeve oba niza kao i sumu svakog niza.
//Napomena: Nizovi se stampaju koristeci petlje.
//
//Primer izvrsenja:
//Unesite N: 9
//Unesite broj: 1
//Unesite broj: 2
//Unesite broj: 4
//Unesite broj: 8
//Unesite broj: 3
//Unesite broj: 9
//Unesite broj: 13
//Unesite broj: 10
//Unesite broj: 4
//
//Niz parnih: 2, 4, 8, 10, 4
//Suma parnih: 28
//Niz neparnih: 1, 3, 9, 13
//Suma neparnih: 26
public class Zadatak3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int temp;
        int n;
        int sumaParnih = 0;
        int sumaNeparnih = 0;
        ArrayList<Integer> nizParnih = new ArrayList<Integer>();
        ArrayList<Integer> nizNeparnih = new ArrayList<Integer>();

        System.out.print("Unesite N: ");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            temp = scanner.nextInt();
            if (temp % 2 == 0) {
                nizParnih.add(temp);
                sumaParnih += temp;
            } else {
                nizNeparnih.add(temp);
                sumaNeparnih += temp;
            }
        }
        System.out.print("Niz parnih: " + nizParnih.get(0));
        for (int i = 1; i < nizParnih.size(); i++) {
            System.out.print(", " + nizParnih.get(i));
        }
        System.out.println();
        System.out.println("Suma parnih: " + sumaParnih);
        System.out.print("Niz neparnih: " + nizNeparnih.get(0));
        for (int i = 1; i < nizNeparnih.size(); i++) {
            System.out.print(", " + nizNeparnih.get(i));
        }
        System.out.println();
        System.out.println("Suma neparnih: " + sumaNeparnih);


    }
}
