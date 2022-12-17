package domaci16_12_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite dimenziju tabele: ");
        int a = s.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int i1 = 1; i1 <= a; i1++) {
                System.out.print("_|");
            } System.out.println();

        }
    }
}
