package p16_12_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite M: ");
        int m = s.nextInt();
        System.out.println("Unesite N: ");
        int n = s.nextInt();

        for (int i = m; i <=n; i++) {
            System.out.print(i+",");

        }
    }
}
