package p26_12_2022;

import java.util.Scanner;

//Napisati metodu koja proverava da li je trougao pravougli. Metoda prima stranice trougla i hipotenuzu trougla. Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
//Trougao je pravougli ukoliko je a*a+b*b=c*c
public class Zadatak9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite A trougla: ");
        int a = scanner.nextInt();
        System.out.println("Unesite B trougla: ");
        int b = scanner.nextInt();
        System.out.println("Unesite C trougla: ");
        int c = scanner.nextInt();
        System.out.println("Da li je pravougli? Odgovor je " + daLiJePravougli(a, b, c) + "!");
    }

    public static boolean daLiJePravougli(int a, int b, int c) {
        if (a * a + b * b == c * c) {
            return true;
        } else {
            return false;
        }

    }
}
