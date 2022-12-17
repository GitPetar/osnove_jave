package domaci16_12_2022;

import java.util.Scanner;

public class Zadatak4_drugi_nacin {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite dimenziju tabele: ");
        int a = s.nextInt();

        for (int i = 1; i <= (a * a); i++) {
            System.out.print("_|");
            if (i % a == 0) {
                System.out.println();
            }


        }
    }
}
