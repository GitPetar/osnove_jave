package domaci_13_12_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Dobrodošli u program za izračunavanje trougla");
        System.out.println("Verzija: 74.125.1");
        System.out.println("");
        System.out.println("Izaberite dužinu stranice a izražene u cm: ");
        double a = s.nextDouble();

        System.out.println("Površina trougla je: "+((a*a*1.73)/4));
        System.out.println("Obim trougla je: "+(a*3));
        System.out.println("");
        System.out.println("Ako želite da vidite poluprečnik opisane kružnice, kupite premijum verziju programa");
    }
}
