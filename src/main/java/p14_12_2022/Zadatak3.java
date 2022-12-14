package p14_12_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.print("a: ");
        a = s.nextDouble();
        System.out.print("b: ");
        b = s.nextDouble();
        System.out.print("c: ");
        c = s.nextDouble();

        System.out.println("Srednja vrednost je: " + ((a + b + c) / 3));
    }
}
