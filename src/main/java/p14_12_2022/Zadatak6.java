package p14_12_2022;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite a: ");
        a = s.nextInt();
        System.out.print("Unesite b: ");
        b = s.nextInt();
        System.out.print("Unesite c: ");
        c = s.nextInt();

        if (a == b && b == c)  {
            System.out.println("Trougao je jednakostranicni");
        } else {
        if (a * a + b * b == c * c) {
            System.out.println("Trougao je pravougli");
        } else {
            System.out.println("Trougao nije pravougli");
        }}
    }
}
