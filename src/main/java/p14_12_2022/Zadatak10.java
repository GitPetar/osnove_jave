package p14_12_2022;

import java.util.Scanner;

public class Zadatak10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.println("Proverite da li je broj 'a' deljiv sa 'b' i 'c'");
        System.out.println("Unesite 'a': ");
        a = s.nextInt();
        System.out.println("Unesite 'b': ");
        b = s.nextInt();
        System.out.println("Unesite 'c': ");
        c = s.nextInt();

        if (a % b == 0 && a % c == 0) {
            System.out.println("Broj 'a' je deljiv sa oba broja");
        } else if (a % b == 0) {
            System.out.println("Broj 'a' je deljiv samo sa brojem 'b'");
        } else if (a % c == 0) {
            System.out.println("Broj 'a' je deljiv samo sa brojem 'c'");
        } else {
            System.out.println("Broj 'a' nije deljiv ni sa 'b', ni sa 'c'");
        }
    }
}
