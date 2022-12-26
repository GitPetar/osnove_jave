package p26_12_2022;

import java.util.Scanner;

//Napisati metodu koja vraca suprotno negativni broj od prosledjenog. Metoda prima broj N i vraca ga sa negativnom vrednoscu.
//Primer: Ako se metoda pozove za N=10, vraca -10
//	Ako se metoda pozove za N=-11, vraca 11
public class Zadatak8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite N: ");
        int n = scanner.nextInt();
        System.out.println(unoReverseCard(n));
    }

    public static int unoReverseCard(int x) {

        return -x;
    }
}
