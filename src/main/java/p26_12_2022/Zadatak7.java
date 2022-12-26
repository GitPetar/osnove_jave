package p26_12_2022;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m;

        System.out.print("Uneiste M: ");
        m = scanner.nextInt();

        for (int i = 1; i <= m; i++) {

            Zadatak6.zvezdice(i);

        }

    }
}
