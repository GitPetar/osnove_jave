package p14_12_2022;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite b: ");
        b = s.nextInt();
        System.out.print("Unesite c: ");
        c = s.nextInt();
        System.out.print("Unesite a: ");
        a = s.nextInt();
        if (a >= b && a <= c) {
            System.out.println("a je u opsegu od b do c!");
        }
    }
}
