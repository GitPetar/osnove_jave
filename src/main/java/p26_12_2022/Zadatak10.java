package p26_12_2022;

import java.util.Scanner;

public class Zadatak10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite rimski broj: ");
        String broj = scanner.next();
        System.out.println("Broj koji ste uneli je broj " + arapizacija(broj));
    }

    public static int arapizacija(String broj) {
        if (broj.equals("I")) {
            return 1;
        } else if (broj.equals("II")) {
            return 2;
        } else if (broj.equals("III")) {
            return 3;

        } else if (broj.equals("IV")) {
            return 4;

        } else if (broj.equals("V")) {
            return 5;

        } else {
            return 0;
        }
    }
}
