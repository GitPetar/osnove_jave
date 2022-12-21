package p19_12_2022;

import java.util.Scanner;

//(Za vezbanje) Napisati program koji za sve petocifene brojeve radi mirror opciju.
//Primer izvrsenja:
//Unesite broj: 32492
//Novi broj je 29423
public class Zadatak10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite broj: ");
        int n = s.nextInt();
        int rezultat = 0;
        int mod = 10000;
        for (int i = 0; i < 5; i++) {
            rezultat = ((n % 10) * mod) + rezultat;
            n = n / 10;
            mod = mod / 10;
        }
        System.out.println("Novi broj je: "+rezultat);
    }
}
