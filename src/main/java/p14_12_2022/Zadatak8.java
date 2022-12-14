package p14_12_2022;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Upisite broj: ");
        int a = s.nextInt();

        if (a < 10) {
            System.out.println("Ovo je jednocifreni broj");
        } else if (a < 100) {
            System.out.println("Ovo je dvocifreni broj");
        } else if (a > 99) {
            System.out.println("Ovo je trocifreni broj");
        }
    }
}


