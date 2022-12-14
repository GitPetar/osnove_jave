package p14_12_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        int b;

        System.out.print("Unesite a: ");
        a = s.nextInt();
        System.out.print("Unesite b: ");
        b = s.nextInt();

        if (a > b) {
            System.out.println("a je vece od b");
        }
        if (b > a) {
            System.out.println("b je vece od a");
        }
        if (a == b) {
            System.out.println("EROR! EROR! Shutting down!!!");
            System.exit(1);
        }

    }
}
